#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
  int a=999;
  char buf[512];
  while (a != 0) {
    printf("Enter value for a: ");
    fflush(stdout);
    fgets(buf, 510, stdin);
    a=atoi(buf);
    switch(a)       {
      int b=1;
    case 1:
      printf("a=%d, b=%d\n",a, b);
      break;
    default:
      b=a;
      printf("a=%d, b=%d\n",a, b);
      break;
    }
  }
  return 0;
}
