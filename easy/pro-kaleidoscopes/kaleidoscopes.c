#include <stdio.h>

int main() {
    int kaleidoscopes;
    scanf("%d", &kaleidoscopes);
    
    double price = 5 * kaleidoscopes;
    if (kaleidoscopes > 1) price *= 0.9;
    price *= 1.07;
    printf("%.2f", price);
    
    return 0;
}
