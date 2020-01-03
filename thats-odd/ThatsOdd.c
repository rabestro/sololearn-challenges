#include <stdio.h>

int main() {
  int count;
  scanf("%d", &count);
  
  int summa = 0;
  while (count--) {
    int number;
    scanf("%d", &number);
    if (number % 2 == 0) summa += number;
  }
   
  printf("%d", summa);
  return 0;
}
