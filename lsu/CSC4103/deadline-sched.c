#define _GNU_SOURCE
#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <string.h>
#include <unistd.h>
#include <sched.h>
#include <linux/sched.h>
#include <sys/syscall.h>
#include <sys/types.h>

struct sched_attr {
    uint32_t size;              /* Size of this structure */
    uint32_t sched_policy;      /* Policy (SCHED_*) */
    uint64_t sched_flags;       /* Flags */
    int32_t sched_nice;         /* Nice value (SCHED_OTHER, SCHED_BATCH) */
    uint32_t sched_priority;    /* Static priority (SCHED_FIFO, SCHED_RR) */
    /* Remaining fields are for SCHED_DEADLINE */
    uint64_t sched_runtime;
    uint64_t sched_deadline;
    uint64_t sched_period;
};

static int sched_setattr (pid_t pid,
			  const struct sched_attr *attr,
			  unsigned int flags) {
    return syscall (SYS_sched_setattr, pid, attr, flags);
}


int main(int argc, char *argv[]) {
  unsigned long long count=0;
  struct sched_attr param;
  cpu_set_t mask;

  if (argc < 3) {
    printf("Usage: %s <runtime> <period>\n", argv[0]);
    return 0;
  }

  bzero(&param, sizeof(param));
  param.size=sizeof(param);
  param.sched_policy=SCHED_DEADLINE;
  param.sched_runtime = atoi(argv[1]);
  param.sched_period = atoi(argv[2]);
  param.sched_deadline = param.sched_period;
  // can't use sched_setscheduler() for SCHED_DEADLINE, must use
  // sched_setattr() instead
  if (sched_setattr(0, &param, 0) != 0) {
    perror("sched_setattr:");
    return 0;
  }

  while (1) {
    count++;
    if (count % 10000000ULL == 0) {
      printf("SCHED_DEADLINE %ld/%ld in loop iteration %lld running\n",
	     atol(argv[1]), atol(argv[2]), count);
    }
  }
}
