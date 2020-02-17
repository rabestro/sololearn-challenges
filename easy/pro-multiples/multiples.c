#include <stdio.h>

int Sn(int d, int N) {int n = N/d; return d * n * ++n / 2;}

int main() {
    int N; scanf("%d", &N); --N;
    
    int const result = Sn(3,N) + Sn(5,N) - Sn(15,N);
    
    printf("%d", result);
    return 0;
}
