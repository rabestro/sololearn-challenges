public class NumberOfOnes
{
    public static void main(String[] args) {
        final var input = new java.util.Scanner(System.in);
        final var number = input.nextInt();
        input.close();
        
        final var ones = Integer.bitCount(number);
        
        System.out.println(ones);
    }
}
