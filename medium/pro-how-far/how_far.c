#include <stdio.h>

int main() {
    int n = 0;
    for (char c; scanf("%c", &c) == 1; ) 
        switch (c) {
            case 'B': if (n) ++n; break;
            case 'H': 
            case 'P': if (n++) {printf("%d", n - 2); return 0;}
        }
    return 0;
}
