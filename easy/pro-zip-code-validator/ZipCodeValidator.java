public final class ZipCodeValidator {
    public static void main(String[] args) {
        final var scanner = new java.util.Scanner(System.in);
        final var zipCode = scanner.nextLine();
        final var isValid = zipCode.matches("\\d{5}");
        System.out.println(isValid);
    }
}
