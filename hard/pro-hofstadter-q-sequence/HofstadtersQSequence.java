public class HofstadtersQSequence
{
    public final static int Q(int n) {
        int[] q = new int[n + 1];
        q[1] = 1;
        q[2] = 1;
        for (int i = 3; i <= n; ++i) {
            q[i] = q[i - q[i - 1]] + q[i - q[i - 2]];
        }
        return q[n];
    }
    
    public static void main(String[] args) {
        var input = new java.util.Scanner(System.in);
        int n = input.nextInt();
        System.out.print(Q(n));
    }
}
