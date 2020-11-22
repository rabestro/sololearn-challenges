public final class CamelToSnake {
    public static void main(String[] args) {
        final var codebase = new java.util.Scanner(System.in).nextLine();
        final var output = codebase.replaceAll("(?<=[^//b^])([A-Z])", "_$1").toLowerCase();
        System.out.println(output);
    }
}
