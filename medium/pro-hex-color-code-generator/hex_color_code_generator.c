#include <stdio.h>

int main() {
    int r, g, b;
    scanf("%d\n%d\n%d", &r, &g, &b);
    printf("#%02x%02x%02x", r, g, b);
    return 0;
}
