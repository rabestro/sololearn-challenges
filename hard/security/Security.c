#include <stdio.h>
#define MAX 200

int main() {
  char floor[MAX];
  char *message;
  int alarm = 0;
  fgets(floor, MAX, stdin);
  
  for (char *c = floor; *c && !message; ++c) 
    if (*c == 'G' && alarm) message = "quiet";
    else if ((*c == '$' || *c == 'T') && alarm++) message = "ALARM"; 
  	   
  puts(message);
  return 0;
}
