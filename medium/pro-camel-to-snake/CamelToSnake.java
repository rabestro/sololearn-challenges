public final class CamelToSnake {
    public static void main(String[] args) {
        System.out.println(
            new java.util.Scanner(System.in)
                .nextLine()
                .replaceAll("(?<=[^//b^])([A-Z])", "_$1")
                .toLowerCase()
        );
    }
}
