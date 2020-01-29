import java.util.Scanner;

public class Roadrunner {
    public static void main(String[] args) {
        
        final var input = new Scanner(System.in);
        final var distanceApart = 50;
        final var distanceSafety = input.nextInt();
        final var speedRoadrunner = input.nextInt();
        final var speedCoyote = input.nextInt();
        input.close();
        
        final var timeToSafety = (double) distanceSafety / speedRoadrunner;
        
        final var isCoyoteCaughtRoadrunner = speedCoyote > (distanceApart + distanceSafety) / timeToSafety;
        
        if (isCoyoteCaughtRoadrunner) {
            System.out.print("Yum");
        } else {
            System.out.print("Meep Meep");
        }
    }
}
