#include <stdio.h>

int main() {
    int siblings;
    int popsicles;
    scanf("%d", &siblings);
    scanf("%d", &popsicles);
    
    printf("%s", popsicles % siblings ? "eat them yourself" : "give away");
    
    return 0;
}
