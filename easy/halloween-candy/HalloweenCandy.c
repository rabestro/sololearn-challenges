#include <stdio.h>
#include <math.h> 

int main() {
    int houses;
    scanf("%d", &houses);

    int const percentage = (int)ceil(100 * 2.0 / houses);
    printf("%d", percentage);
    
    return 0;
}
