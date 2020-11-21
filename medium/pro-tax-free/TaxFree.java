public final class TaxFree {
    public static void main(String[] args) {
        final var sum = new java.util.Scanner(System.in)
                .useDelimiter(",")
                .tokens()
                .mapToInt(Integer::parseInt)
                .mapToDouble(i -> i < 20 ? i * 1.07 : i)
                .sum();

        System.out.printf("%.2f", sum);
    }
}
