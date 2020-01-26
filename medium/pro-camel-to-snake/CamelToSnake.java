public class CamelToSnake {
    public static void main(String[] args) {
        final var input = new java.util.Scanner(System.in);
        final var codebase = input.nextLine();
        input.close();
        
        var output = codebase.replaceAll("(?<=[^//b^])([A-Z])", "_$1").toLowerCase();
        
        System.out.println(output);
    }
}
