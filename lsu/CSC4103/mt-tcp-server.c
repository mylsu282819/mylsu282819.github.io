// multi-threaded threaded TCP echo server
#include <stdio.h>
#include <string.h>
#include <netdb.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <pthread.h>

#define BUFSIZE 100
void *Thread(void *args);

int main(int argc, char **argv) {
  int listen_fd, fd;
  struct sockaddr_in servaddr;
  pthread_t thread1;
  
  listen_fd = socket(AF_INET, SOCK_STREAM, 0);
  bzero( &servaddr, sizeof(servaddr));
  servaddr.sin_family = AF_INET;
  servaddr.sin_addr.s_addr = htons(INADDR_ANY);
  servaddr.sin_port = htons(6666);
  bind(listen_fd, (struct sockaddr *) &servaddr, sizeof(servaddr));
  listen(listen_fd, 20);

  while (1) {
    fd = accept(listen_fd, (struct sockaddr*) NULL, NULL);
    pthread_create(&thread1, NULL, Thread, (void *)fd);
  }
}
 
// Thread to handle one client connection
void *Thread(void *args) {
  int fd = (int)args;
  char buf[BUFSIZE+1];

  printf("Thread %p serving new client.\n", pthread_self());
  bzero(buf, BUFSIZE+1);
  while(read(fd, buf, BUFSIZE) > 1) {
    printf("Thread %p received from client: %s", pthread_self(), buf);
    write(fd, buf, strlen(buf)+1);
    bzero(buf, BUFSIZE+1);
  }
  printf("Thread %p lost connection with client, dying.\n", 
	 pthread_self());
  return NULL;
}
