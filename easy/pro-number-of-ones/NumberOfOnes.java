public class NumberOfOnes
{
    public static void main(String[] args) {
        final var input = new java.util.Scanner(System.in);
        final int number = input.nextInt();
        input.close();
        
        final int ones = Integer.bitCount(number);
        
        System.out.println(ones);
    }
}
