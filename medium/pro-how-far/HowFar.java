public class HowFar {
    public static void main(final String[] args) {
        final var input = new java.util.Scanner(System.in);
        final var street = input.nextLine();
        input.close();

        final int howFar = street.replaceAll("B*[PH](B*)[HP]B*", "$1").length();
        
        System.out.println(howFar);
    }
}
