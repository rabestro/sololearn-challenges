public class CamelToSnake {
    public static void main(String[] args) {
        final var input = new java.util.Scanner(System.in);
        final var codebase = input.nextLine();
        input.close();
        
        var output = new StringBuilder();
        boolean isFirst = true;
        
        for (char c : codebase.toCharArray()) {
            if (Character.isUpperCase(c) && !isFirst) {
                output.append('_');
            }
            output.append(Character.toLowerCase(c));
            isFirst = Character.isWhitespace(c);
        }
        
        System.out.println(output);
    }
}
