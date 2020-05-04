#include <stdio.h>
#include <string.h>
#define MAX 300

int main() {
  char order[MAX];
  fgets(order, MAX, stdin);
  
  double totalCost = 0;
  char menu[5][14] = {"Nachos", "Pizza", "Cheeseburger", "Water", "Coke"};
  int price[5] = {6, 6, 10, 4, 5};
  
  for (char *item = strtok(order, " "); item; item = strtok(NULL, " ")) {
  	 int itemCost = 5; 
  	 for (int i = 0; i < 5; ++i) {
  	 	if (strcmp(item, menu[i]) == 0) {
  	 		itemCost = price[i];
  	 		break;
  	 	}
  	 }
  	 totalCost += itemCost;
  }
  
  totalCost *= 1.07;
  printf("%.2f", totalCost);
  return 0;
}
