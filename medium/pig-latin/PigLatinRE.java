public final class PigLatinRE {
    public static void main(String[] args) {
        System.out.println(
                new java.util.Scanner(System.in)
                        .nextLine()
                        .replaceAll("(\\S)(\\S*)", "$2$1ay")
        );
    }
}
