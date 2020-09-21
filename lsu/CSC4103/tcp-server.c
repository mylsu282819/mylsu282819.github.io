// single-threaded TCP echo server
#include <stdio.h>
#include <string.h>
#include <netdb.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/socket.h>

#define BUFSIZE 100

int main(int argc, char **argv) {
  char buf[BUFSIZE+1];
  int listen_fd, fd;
  struct sockaddr_in servaddr;
  
  listen_fd = socket(AF_INET, SOCK_STREAM, 0);
  bzero( &servaddr, sizeof(servaddr));
  servaddr.sin_family = AF_INET;
  servaddr.sin_addr.s_addr = htons(INADDR_ANY);
  servaddr.sin_port = htons(6666);
  bind(listen_fd, (struct sockaddr *) &servaddr, sizeof(servaddr));
  listen(listen_fd, 20);
  while (1) {
    fd = accept(listen_fd, (struct sockaddr*) NULL, NULL);
    
    bzero(buf, BUFSIZE+1); 
    while(read(fd, buf, BUFSIZE) > 1) {
      printf("Received from client: %s", buf);
      write(fd, buf, strlen(buf)+1);
      bzero(buf, BUFSIZE+1); 
    }
  }
}
