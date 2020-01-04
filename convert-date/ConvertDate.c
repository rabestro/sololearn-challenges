#include <stdio.h>
#include <string.h>
#define MAX 40

int main() {
  char usDate[MAX];
  fgets(usDate, MAX, stdin);
  
  int month = 0, day, year;
  
  if (strlen(usDate) > 10) {
    char monthName[12];
    sscanf(usDate, "%s %d, %d", monthName, &day, &year);
    char *months[] = {"January", "February", "March", "April", "May", "June", 
  	     "July", "August", "September", "October", "November", "December"};
    while (strcmp(monthName, months[month++]) && month < 12);
  }
  else sscanf(usDate, "%d/%d/%d", &month, &day, &year);
  
  printf("%d/%d/%d", day, month, year);
  return 0;
}
