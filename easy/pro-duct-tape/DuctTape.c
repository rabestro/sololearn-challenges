#include <stdio.h>
#include <math.h>

int main() {
    int h, w;
    scanf("%d\n%d", &h, &w);
    printf("%d", (int)ceil(h * w / 5.));
    return 0;
}
