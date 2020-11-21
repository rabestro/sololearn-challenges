public final class AverageWordLength {
    public static void main(String[] args) {
        final var essay = new java.util.Scanner(System.in).nextLine();
        final var wordsCount = essay.split("\\W").length;
        final var charsCount = essay.replaceAll("\\W", "").length();
        final var average = (int) Math.ceil((double) charsCount / wordsCount);
        System.out.print(average);
    }
}
