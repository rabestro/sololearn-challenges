#include <stdio.h>

int main() {
    int fruit;
    scanf("%d", &fruit);

    //your code goes here
    
    int const apples = fruit / 2;
    int const pies = apples / 3;
    
    printf("%d", pies);
    
    return 0;
}
