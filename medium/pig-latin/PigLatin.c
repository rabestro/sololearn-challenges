#include <stdio.h>
#include <string.h>
#define MAX 200

int main() {
  char sentence[MAX];
  fgets(sentence, MAX, stdin);
  
  for (char *word = strtok(sentence, " "); word; word = strtok(NULL, " ")) 
    printf("%s%cay ", word + 1, *word);
  
  return 0;
}
