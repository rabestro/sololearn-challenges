#include <stdio.h>

int main() {
    int eggs, you, friend;
    scanf("%d\n%d\n%d", &eggs, &you, &friend);
    
    puts(you + friend < eggs ? "Keep Hunting" : "Candy Time");
    
    return 0;
}
