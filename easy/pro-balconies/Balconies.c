#include <stdio.h>

int main() {
    int aw, al, bw, bl;
    scanf("%d,%d", &aw, &al);
    scanf("%d,%d", &bw, &bl);
    
    char ap = 'A' + (aw * al < bw * bl);
    printf("Apartment %c", ap);
    
    return 0;
}
