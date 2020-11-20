public class SnapCrackleAndPop {
    public static void main(String[] args) {
        new java.util.Scanner(System.in)
                .tokens()
                .map(Integer::parseInt)
                .map(i -> i % 3 > 0 ? i % 2 > 0 ? "Snap " : "Crackle " : "Pop ")
                .forEach(System.out::print);
    }
}
