#include <stdio.h>

int main() {
  int hours;
  int minutes;
  char indicator;
  scanf("%d:%d %cM", &hours, &minutes, &indicator);
  
  if (indicator == 'P') hours += 12;
  else if (hours == 12) hours = 0;
  printf("%02d:%02d", hours, minutes);
  
  return 0;
}
