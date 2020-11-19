public final class VowelCounterRE {
    public static void main(String[] args) {
        final var vowels = new java.util.Scanner(System.in)
            .nextLine()
            .replaceAll("[^AEIOUaeiou]", "")
            .length();
        System.out.println(vowels);
    }
}
