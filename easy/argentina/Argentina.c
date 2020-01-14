#include <stdio.h>

int main() {
    int pesos;
    scanf("%d", &pesos);
    int dollars;
    scanf("%d", &dollars);
    
    if (dollars * 50l > pesos) puts("Pesos");
    else puts("Dollars");
    
    return 0;
}
