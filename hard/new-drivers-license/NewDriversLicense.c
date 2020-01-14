#include <stdio.h>
#include <string.h>
#define MAX 200

int main() {
  char name[MAX];
  int agents;
  char persons[4][MAX];
  scanf("%s", name);
  scanf("%d", &agents);
  scanf("%s %s %s %s", persons[0], persons[1], persons[2], persons[3]);
  
  int position = 0;
  for (int i = 4; i--; ) 
    if (strcmp(name, persons[i]) > 0) 
      ++position;
      
  printf("%d", 20 + 20 * (int)(position / agents));
  return 0;
}
