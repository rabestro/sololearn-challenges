#include <stdio.h>

int main() {
    int criminals;
    scanf("%d", &criminals);
    
    if (criminals < 5) puts("I got this!");
    else if (criminals < 11) puts("Help me Batman");
    else puts("Good Luck out there!");
    
    return 0;
}
