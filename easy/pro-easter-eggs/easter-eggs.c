#include <stdio.h>

int main() {
    int totalNumberEggs, yourAmount, friendsAmount;
    scanf("%d\n%d\n%d", &totalNumberEggs, &yourAmount, &friendsAmount);
    
    puts(yourAmount + friendsAmount < totalNumberEggs ? "Keep Hunting" : "Candy Time");
    
    return 0;
}
