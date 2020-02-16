#include <stdio.h>

int main() {
    int i;
    
    while(scanf("%d\n", &i) == 1)
        printf(i % 3 == 0 ? "Pop " : i % 2 == 0 ? "Crackle " : "Snap ");
        
    return 0;
}
