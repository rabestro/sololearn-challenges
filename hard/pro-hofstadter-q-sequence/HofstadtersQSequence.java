public class HofstadtersQSequence {
    
    public final static int Q(final int n) {
        final int[] q = new int[n];
        q[0] = 1;
        q[1] = 1;
        for (int i = 2; i < n; ++i) {
            q[i] = q[i - q[i - 1]] + q[i - q[i - 2]];
        }
        return q[n - 1];
    }

    public static void main(final String[] args) {
        final var input = new java.util.Scanner(System.in);
        final var n = input.nextInt();
        input.close();
        
        System.out.print(Q(n));
    }
}
