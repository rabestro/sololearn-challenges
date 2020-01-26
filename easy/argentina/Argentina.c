#include <stdio.h>

int main() {
    int pesos, dollars;
    scanf("%d\n%d", &pesos, &dollars);
    
    if (dollars * 50l > pesos) puts("Pesos");
    else puts("Dollars");
    
    return 0;
}
