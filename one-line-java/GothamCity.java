public class GothamCity {
    public static void main(String[] args) {
        
        System.out.print(
            new String[] {"I got this!", "Help me Batman", "Good Luck out there!"}
                [Math.min((1 + new java.util.Scanner(System.in).nextInt()) / 6, 2)]
        );
    }
}
