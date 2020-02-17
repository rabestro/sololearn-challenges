#include <stdio.h>

int main() {
    int vowels = 0;
    
    for (char c; scanf("%c", &c) == 1;) 
        for (int i = 0; i < 10; ++i) 
            if ("AEIOUaeiou"[i] == c) {++vowels; break;}
            
    printf("%d", vowels);
    return 0;
}
