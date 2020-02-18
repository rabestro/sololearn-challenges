#include <stdio.h>

int main() {
    int const students = 15;
    int blocks[4];
    scanf("%d\n%d\n%d\n%d", blocks, blocks + 1, blocks + 2, blocks + 3);
    
    int remainingBlocks = 0, i = 4;
    while (i--) remainingBlocks += blocks[i] % students;
    
    printf("%d", remainingBlocks);
    
    return 0;
}
