#include <stdio.h>
#include <string.h>
#define MAX 300

int main() {
  char boxes[MAX], item[MAX];
  scanf("%s\n%s", boxes, item);
  
  int time = 5;
  for (char *box = strtok(boxes, ","); box; box = strtok(NULL, ",")) 
  	 if (strcmp(item, box)) time += 5;
  	 else break;
  
  printf("%d", time);
  return 0;
}
