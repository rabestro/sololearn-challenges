public class ZipCodeValidator {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        var zipCode = scanner.nextLine();
        var isValid = zipCode.matches("\\d{5}");
        System.out.println(isValid);
    }
}
