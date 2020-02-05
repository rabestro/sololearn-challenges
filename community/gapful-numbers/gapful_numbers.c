// Gapful numbers
// https://www.sololearn.com/learn/14303/?ref=app

#include <stdio.h>

int main() {
	int number;
	scanf("%d", &number);
	int rest = number % (number / 100 + number % 10);
	printf("Number %d %d", number, rest);
	
	return 0;
}
