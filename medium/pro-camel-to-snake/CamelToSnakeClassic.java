public class CamelToSnakeClassic {
    public static void main(final String[] args) {
        final var input = new java.util.Scanner(System.in);
        final var codebase = input.nextLine();
        input.close();

        final var output = new StringBuilder();
        boolean isFirst = true;

        for (final char c : codebase.toCharArray()) {
            if (Character.isUpperCase(c) && !isFirst) {
                output.append('_');
            }
            output.append(Character.toLowerCase(c));
            isFirst = Character.isWhitespace(c);
        }
        
        System.out.println(output);
    }
}
