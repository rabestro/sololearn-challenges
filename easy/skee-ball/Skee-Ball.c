#include <stdio.h>

int main() {
    int points;
    scanf("%d", &points);
    int price;
    scanf("%d", &price);
    
    if (points / 12 >= price) puts("Buy it!");
    else puts("Try again");
    
    return 0;
}
