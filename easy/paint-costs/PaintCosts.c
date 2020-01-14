#include <stdio.h>
#include <math.h> 

int main() {
    int colors;
    scanf("%d", &colors);
    printf("%d", (int)round(1.1 * (5 * colors + 40)));
    return 0;
}
