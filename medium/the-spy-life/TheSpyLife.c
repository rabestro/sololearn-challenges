#include <stdio.h>
#include <ctype.h>
#include <string.h>
#define MAX 200

int main() {
  char message[MAX];
  fgets(message, MAX, stdin);
  
  for (int i = strlen(message); i--; ) {
    char c = message[i];
    if (isalpha(c) || isspace(c)) putchar(c);
  }
    
  return 0;
}
