#include <stdio.h>
#include <string.h>

int main() {
  char word[80];
  fgets(word, 80, stdin);
	
  int i = strlen(word);
  while (i-->0) printf("%c", word[i]);
	  
  return 0;
}
