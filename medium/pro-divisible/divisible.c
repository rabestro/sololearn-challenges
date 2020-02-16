#include <stdio.h>

int main() {
    int n, i;
    scanf("%d\n", &n);
    
    while (scanf("%d", &i) == 1) 
        if (n % i) {
        	puts("not divisible by all");
        	return 0;
        }
    
    puts("divisible by all");
    return 0;
}
