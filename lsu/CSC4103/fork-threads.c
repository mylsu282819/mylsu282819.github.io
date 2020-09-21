#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <pthread.h>

// function prototypes for fork_threads.c functions
int main(int argc, char** argv);     
void *Thread(void *args);

// globals
int val1=1, val2=2, val3=3, val4=4;

int main(int argc, char** argv) {

  int pid;

  pthread_t thread1, thread2;

  printf("PARENT: Creating thread.\n");
  pthread_create(&thread1, NULL, Thread, "parent");
  printf("PARENT: Thread created, forking child.\n");
  pid = fork();

  if (pid) {  // parent
    while (1) {
      printf("PARENT: val1=%d, val2=%d, val3=%d, val4=%d,\n", 
	     val1, val2, val3, val4);
      sleep(5);
      val1=3;
      val2=4;
    }
  }
  else {     // child
    printf("CHILD: Creating thread.\n");
    pthread_create(&thread2, NULL, Thread, "child");
    printf("CHILD: Thread created.\nn");
    while (1) {
      printf("CHILD: val1=%d, val2=%d, val3=%d, val4=%d\n", 
	     val1, val2, val3, val4);
      sleep(5);
      val1=5;
      val2=6;
    }
  }
}

//////////////////////////////
// This function is the thread body.  Prints thread ID, sleeps, and repeats.

void *Thread(void *args) {

  while (1) {
    printf("Hi from the %s's thread.  val1=%d, val2=%d, val3=%d, val4=%d\n", args,
	   val1, val2, val3, val4);
    if (!strcmp(args,"child")) {
      val3=9;
      val4=10;
    }
    else {
      val3=10;
      val4=9;
    }
    sleep (2);
  }
  return NULL;
}


