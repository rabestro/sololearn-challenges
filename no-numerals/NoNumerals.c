#include <stdio.h>
#include <string.h>
#define MAX 200

char *numberToWord(char *word) {
  char const *numbers[] = {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1", "0"};
  char const *words[] = {"ten", "nine", "eight", "seven", "six", "five", "four", "three", "two", "one", "zero"};

  for (int i = 0; i < 11; ++i)
    if (strcmp(word, numbers[i]) == 0) 
      return words[i]; 
       
  return word;
}

int main() {
  char phrase[MAX];
  fgets(phrase, MAX, stdin);
  
  for (char *word = strtok(phrase, " "); word; word = strtok(NULL, " ")) 
    printf("%s ", numberToWord(word));
  
  return 0;
}
