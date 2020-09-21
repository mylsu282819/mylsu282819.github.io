#define _GNU_SOURCE
#include <sched.h>
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
  unsigned long long count=0;
  struct sched_param param;
  cpu_set_t mask;

  printf("SCHED_OTHER with priority 0 about to pin to CPU 0.\n");

  param.sched_priority = 0;
  if (sched_setscheduler(0, SCHED_OTHER, &param) != 0) {
    perror("sched_setscheduler:");
    return 0;
  }

  CPU_ZERO(&mask);
  CPU_SET(0, &mask);
  if (sched_setaffinity(0, sizeof(mask), &mask) !=0 ) {
    perror("sched_setaffinity:");
    return 0;
  }

  printf("SCHED_OTHER pinned to CPU 0.\n");

  while (1) {
    count++;
    printf("SCHED_OTHER in loop iteration %lld running\n",
	   count);
  }
}
