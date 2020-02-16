#include <stdio.h>

int main() {
    int const carrotsForCake = 7;
    int carrots, boxes;
    scanf("%d\n%d", &carrots, &boxes);
    
    int const leftOverCarrots = carrots % boxes;
    int const isEnoughForCake = leftOverCarrots >= carrotsForCake;
    
    if (isEnoughForCake) {
        printf("Cake Time");
    } else {
        int const needMoreCarrots = carrotsForCake - leftOverCarrots;
        printf("I need to buy %d more", needMoreCarrots);
    }
    return 0;
}
