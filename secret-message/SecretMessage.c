#include <stdio.h>
#include <ctype.h>
#define MAX 200

int main() {
  char message[MAX];
  
  for (char *c = fgets(message, MAX, stdin); *c; ++c) 
    if (isalpha(*c)) putchar('a' + 'z' - tolower(*c));
    else putchar(*c);
  
  return 0;
}
