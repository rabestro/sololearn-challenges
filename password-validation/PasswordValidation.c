#include <stdio.h>
#include <string.h>

int main() {
  char password[80];
  fgets(password, 80, stdin);
  
  int numbers = 0; 
  int symbols = 0; 
  int length = 0;
  
  for (char *p = password; *p; ++p) {
  	 if (*p >= '0' && *p <= '9') ++numbers;
  	 if (strchr("!@#$%&*", *p) != NULL) ++symbols;
  	 ++length;
  }
  
  if (length > 6 && numbers > 1 && symbols > 1) puts("Strong");
  else puts("Weak");
  
  return 0;
}
