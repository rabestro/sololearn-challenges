#include <stdio.h>
#define MAX 200

int main() {
  char floor[MAX];
  char *message;
  int status = 0;
  
  for (char *c = fgets(floor, MAX, stdin); *c && !message; ++c) 
    if (*c == 'G' && status) message = "quiet";
    else if ((*c == '$' || *c == 'T') && status++) message = "ALARM"; 
  	   
  puts(message);
  return 0;
}
