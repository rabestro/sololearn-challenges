#include <stdio.h>

int main() {
    int fruit;
    scanf("%d", &fruit);

    int const pies = fruit / 2 / 3;
    printf("%d", pies);
    return 0;
}
