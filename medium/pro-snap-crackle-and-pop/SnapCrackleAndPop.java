public class SnapCrackleAndPop {
    public static void main(String[] args) {

        new java.util.Scanner(System.in)
                .tokens()
                .mapToInt(Integer::parseInt)
                .mapToObj(i -> i % 3 == 0 ? "Pop " : i % 2 == 0 ? "Crackle " : "Snap ")
                .forEach(System.out::print);
    }
}
