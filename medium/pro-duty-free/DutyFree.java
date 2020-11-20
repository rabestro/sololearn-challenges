public final class DutyFree {
    public static void main(String[] args) {
        System.out.print(
                new java.util.Scanner(System.in)
                        .useDelimiter(" ")
                        .tokens()
                        .mapToDouble(Double::parseDouble)
                        .map(x -> 1.1 * x)
                        .anyMatch(x -> x > 20)
                        ? "Back to the store" 
                        : "On to the terminal"
        );
    }
}
