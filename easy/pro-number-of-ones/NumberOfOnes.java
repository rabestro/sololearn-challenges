public final class NumberOfOnes {
    public static void main(String[] args) {
        final var scanner = new java.util.Scanner(System.in);
        final var number = scanner.nextInt();
        final var ones = Integer.bitCount(number);
        System.out.println(ones);
    }
}
