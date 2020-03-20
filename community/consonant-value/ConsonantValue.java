public class ConsonantValue {

    public static void main(String[] args) {
        final var word = new java.util.Scanner(System.in).next();
        System.out.print(solve(word));
    }

    public static int solve(final String s) {
        return java.util.Arrays
            .stream(s.split("[aeiou]+"))
            .mapToInt(str -> str.chars().map(c -> 1 + c - 'a').sum())
            .max().orElse(0);
    }
}
