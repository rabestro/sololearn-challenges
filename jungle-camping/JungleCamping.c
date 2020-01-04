#include <stdio.h>
#include <string.h>
#define MAX 500

int main() {
  char *animals[] = {"Lion", "Tiger", "Snake", "Bird"};
  char *sounds[] = {"Grr", "Rawr", "Ssss", "Chirp"};
   
  char noise[MAX];
  fgets(noise, MAX, stdin);
  
  for (char *sound = strtok(noise, " "); sound; sound = strtok(NULL, " ")) 
    for (int i = 0; i < 4; ++i)
      if (strcmp(sound, sounds[i]) == 0)
   	printf("%s ", animals[i]);
   
   return 0;
}
