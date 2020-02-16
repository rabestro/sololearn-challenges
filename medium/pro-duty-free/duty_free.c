#include <stdio.h>

int main() {
    float item;
    while (1 == scanf("%f", &item)) {
    	if (item * 1.1 > 20) {
    		puts("Back to the store");
    		return 0;
    	}
    }
    puts("On to the terminal");
    return 0;
}
