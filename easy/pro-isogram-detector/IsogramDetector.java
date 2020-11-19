public final class IsogramDetector {
    public static void main(String[] args) {
        final var word = new java.util.Scanner(System.in).next();
        final var isIsogram = !word.matches(".*(.).*\\1.*");
        System.out.println(isIsogram);
    }
}
