public final class Candles {
    public static void main(String[] args) {
        final int friends = new java.util.Scanner(System.in).nextInt();
        final int candles = 9 * (1 + friends);
        
        System.out.print(candles);
    }
}
