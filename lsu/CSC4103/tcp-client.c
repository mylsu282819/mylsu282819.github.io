// single-threaded TCP echo client
#include <stdio.h>
#include <string.h>
#include <netdb.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <arpa/inet.h>

#define BUFSIZE 100

int main(int argc, char **argv) {
  char buf[BUFSIZE+1]; 
  int fd;
  struct sockaddr_in servaddr;
 
  fd=socket(AF_INET,SOCK_STREAM, 0);
  bzero(&servaddr, sizeof servaddr);
  servaddr.sin_family=AF_INET;
  servaddr.sin_port=htons(6666);
  // local host only
  inet_pton(AF_INET,"127.0.0.1",&(servaddr.sin_addr));
  connect(fd,(struct sockaddr *)&servaddr,sizeof(servaddr));
 
  while(1) {
    bzero(buf, BUFSIZE+1);
    fgets(buf, BUFSIZE, stdin);
    write(fd,buf,strlen(buf)+1);
    bzero(buf, BUFSIZE+1);
    read(fd,buf,BUFSIZE);
    printf("Received from server: %s\n", buf);
  }
 
}
