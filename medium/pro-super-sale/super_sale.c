#include <stdio.h>

int main() {
    float item, sum, max;
    for (max = sum = 0; 1 == scanf("%f,", &item); sum += item) 
        if (item > max) max = item;
    int save = (sum - max) * 0.3 * 1.07;
    
    printf("%d", save);
    return 0;
}
