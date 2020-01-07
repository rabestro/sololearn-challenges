#include <stdio.h>
#define MAX 200

int main() {
  char floor[MAX];
  char *message = NULL;
  int status = 0;
  fgets(floor, MAX, stdin);
  
  for (char *c = floor; *c && !message; ++c) 
    if (*c == 'G' && status) message = "quiet";
    else if ((*c == '$' || *c == 'T') && status++) message = "ALARM"; 
  	   
  puts(message);
  return 0;
}
