#include <stdio.h>

int main() {
    char s[99]; 
    char* c = fgets(s, 99, stdin);
    int n; 
    scanf("%d", &n);
    
    for (int i = 0; *c; ++i, ++c) {
        if (*c == '\n') break;
        if (i && i % n == 0) putchar('-');
    	putchar(*c);
    }
    	
    return 0;
}
