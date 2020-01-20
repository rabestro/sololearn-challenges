#include <stdio.h>
#define MAX 200

int main() {
    char text[MAX];
    char *p = fgets(text, MAX, stdin);
    
    for(char c; c = *p++; ++p) while ((*p)--> '0') putchar(c);
    
    return 0;
}
