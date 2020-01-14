// Doesn't work for big numbers

public class HofstadtersQSequence
{
   static int Q(int n) {
      return n > 2 ? Q(n - Q(n - 1)) + Q(n - Q(n - 2)) : 1;
   }
   
   public static void main(String[] args) {
      var input = new java.util.Scanner(System.in);
      int n = input.nextInt();
      
      System.out.print(Q(n));
    }
}
