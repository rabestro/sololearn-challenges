public final class SnowballingNumbers {
    public static void main(String[] args) {

        System.out.println(
                new java.util.Scanner(System.in)
                        .tokens()
                        .skip(1)
                        .mapToInt(Integer::parseInt)
                        .reduce((a, b) -> a = a > 0 && b > a ? a + b : 0)
                        .orElse(0)
                        > 0
        );
    }
}
