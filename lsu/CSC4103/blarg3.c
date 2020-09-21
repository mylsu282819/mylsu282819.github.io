#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {

  unsigned long *p=malloc(sizeof(unsigned long));
  *p=0xdeadbeefcafebabe;
  unsigned long *q=p;
  int i;

  // output the individual bytes of the unsigned long value...or not?

  for (i=0; i < sizeof(unsigned long); i++) {
    printf("%02x ", *((unsigned char *)q));
    q++;
  }
  printf("\n");
}
