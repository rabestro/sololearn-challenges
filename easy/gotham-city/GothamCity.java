public class GothamCity {
    public static void main(String[] args) {
        System.out.print(java.text.MessageFormat.format(
            "{0,choice,0<I got this!|4<Help me Batman|10<Good Luck out there!}",
            new java.util.Scanner(System.in).nextInt())
        );
    }
}
