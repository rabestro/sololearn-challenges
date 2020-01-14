#include <stdio.h>
#include <string.h>
#define MAX 200

int main() {
  char string[MAX];
  char *c = fgets(string, MAX, stdin);
  
  for (; *c; ++c) if (strchr(c + 1, *c)) break;
    
  puts(*c ? "Deja Vu" : "Unique");
 
  return 0;
}
