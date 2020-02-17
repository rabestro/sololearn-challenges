#include <stdio.h>
#include <string.h>
 
int main() {
    char s[99];  
    
    for (int i = 4; i--;) {
        char *b = fgets(s, 99, stdin);
        char *e = s + strlen(s);
        if (*--e == '\n') --e;
        while (b < e && *b == *e--) ++b;
        if (b >= e) return puts("Open");
    }
    return puts("Trash");
}
