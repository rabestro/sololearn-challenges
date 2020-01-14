#include <stdio.h>

int main() {
    int yards;
    scanf("%d", &yards);
    
    if (yards > 10) puts("High Five");
    else if (yards < 1) puts("shh");
    else while (yards--) printf("Ra!");
    
    return 0;
}
