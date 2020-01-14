#include <stdio.h>
#include <ctype.h>
#define MAX 200

int main() {
  char text[MAX];
  
  for (char *c = fgets(text, MAX, stdin); *c; ++c)
    if (isalnum(*c) || isspace(*c)) putchar(*c);
  
  return 0;
}
