#include <stdio.h>

int main() {
    int fruit;
    scanf("%d", &fruit);

    int const pies = fruit / 6;
    printf("%d", pies);
    return 0;
}
