#include <stdio.h>
#include <math.h>
#define MAX 5000

int main() {
  char essay[MAX];
  
  int words = 0;
  int characters = 0;
  char previous = 0;
  
  for (char *word = fgets(essay, MAX, stdin); *word; previous = *(word++))
    if (isalpha(*word)) ++characters;
    else if (isalpha(previous)) ++words;
    
  if (isalpha(previous)) ++words;
  printf("%d", (int)ceil(characters / (double)words));
  
  return 0;
}
