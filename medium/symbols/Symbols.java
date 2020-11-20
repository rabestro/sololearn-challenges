public final class Symbols {
    public static void main(String[] args) {
        System.out.print(
                new java.util.Scanner(System.in)
                        .nextLine()
                        .replaceAll("[^a-zA-Z0-9 ]", "")
        );
    }
}
