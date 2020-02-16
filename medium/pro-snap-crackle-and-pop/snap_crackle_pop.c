#include <stdio.h>

int main() {
    int i;
    
    while(scanf("%d\n", &i) == 1)
        printf(i % 3 ? i % 2 ? "Snap " : "Crackle " : "Pop ");
        
    return 0;
}
