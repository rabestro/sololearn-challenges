#include <stdio.h>

int main() {
    int yourAge, years;
    scanf("%d\n%d", &yourAge, &years);
    printf("My twin is %d years old and they are %d years older than me", yourAge + years, years);
    return 0;
}
