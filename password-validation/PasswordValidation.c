#include <stdio.h>
#include <ctype.h>

int main() {
  char password[80];
  fgets(password, 80, stdin);
  
  int numbers = 0; 
  int symbols = 0; 
  int length = 0;
  
  for (char *p = password; *p; ++length, ++p) 
    if (isdigit(*p)) ++numbers;
    else if (strchr("!@#$%&*", *p) != NULL) ++symbols;
  
  if (length > 6 && numbers > 1 && symbols > 1) puts("Strong");
  else puts("Weak");
  
  return 0;
}
