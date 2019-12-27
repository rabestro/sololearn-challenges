#include <stdio.h>

int main() {
    int sales;
    scanf("%d", &sales);
    
    int const income = sales * 3;
    if (income > 21) puts("Profit");
    else if (income < 21) puts("Loss");
    else puts("Broke Even");
    
    return 0;
}
