public final class HowFar {
    public static void main(final String[] args) {
        final var street = new java.util.Scanner(System.in).nextLine();
        final var howFar = street.replaceAll("B*[PH](B*)[HP]B*", "$1").length();
    
        System.out.println(howFar);
    }
}
