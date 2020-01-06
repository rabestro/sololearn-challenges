#include <stdio.h>
#include <string.h>
#define MAX 200

int main() {
  char url[MAX];
  fgets(url, MAX, stdin);
  
  char *p = url + strlen(url);
  while (*--p != '=' && *p != '/' && p != url);
  puts(++p);
  
  return 0;
}
