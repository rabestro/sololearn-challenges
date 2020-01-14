#include <stdio.h>

int main() {
    int friends;
    scanf("%d", &friends);
    int const candles = 9 * (friends + 1);
    printf("%d", candles);
    return 0;
}
