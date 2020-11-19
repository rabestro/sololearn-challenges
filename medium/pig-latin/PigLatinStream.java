public final class PigLatinStream {
    public static void main(String[] args) {
        new java.util.Scanner(System.in)
                .tokens()
                .map(word -> word.substring(1) + word.charAt(0) + "ay ")
                .forEach(System.out::print);
    }
}
