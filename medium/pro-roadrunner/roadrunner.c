#include <stdio.h>

int main() {
    int const distanceApart = 50;
    int distanceSafety, speedRoadrunner, speedCoyote;
    scanf("%d\n%d\n%d", &distanceSafety, &speedRoadrunner, &speedCoyote);
    
    float timeToSafety = (float) distanceSafety / speedRoadrunner;
    int isCoyoteCaughtRoadrunner = speedCoyote > (distanceApart + distanceSafety) / timeToSafety;
    puts(isCoyoteCaughtRoadrunner ? "Yum" : "Meep Meep");
    
    return 0;
}
