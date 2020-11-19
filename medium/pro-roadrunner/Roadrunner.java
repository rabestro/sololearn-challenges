public final class Roadrunner {
    public static void main(String[] args) {
        final var scanner = new java.util.Scanner(System.in);
        final var distanceApart = 50;
        final var distanceSafety = scanner.nextInt();
        final var speedRoadrunner = scanner.nextInt();
        final var speedCoyote = scanner.nextInt();

        final var timeToSafety = (double) distanceSafety / speedRoadrunner;
        final var isCoyoteCaughtRoadrunner = speedCoyote > (distanceApart + distanceSafety) / timeToSafety;
        
        System.out.print(isCoyoteCaughtRoadrunner ? "Yum" : "Meep Meep");
    }
}
