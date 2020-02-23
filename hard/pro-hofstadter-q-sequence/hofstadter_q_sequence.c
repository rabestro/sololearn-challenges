#include <stdio.h>

int main() {
    int i = 1, n;
    scanf("%d", &n);
    
    int q[n];
    *q = q[1] = 1;
    while (++i < n) q[i] = q[i - q[i - 1]] + q[i - q[i - 2]];
    
    return printf("%d", q[--n]);
}
