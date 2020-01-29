public class Candles {
    public static void main(String[] args) {
        final var in = new java.util.Scanner(System.in);
        final int friends = in.nextInt();
        in.close();
        
        final int candles = 9 * (1 + friends);
        
        System.out.print(candles);
    }
}
