#include <stdio.h>
#include <string.h>

int main() {
  char string[200];
  fgets(string, 200, stdin);
  
  int isDejaVu = 0;
  
  for (char *c = string; *c; ++c)
    if (isDejaVu = strchr(c + 1, *c)) break;
    
  if (isDejaVu) puts("Deja Vu");
  else puts("Unique");

  return 0;
}
