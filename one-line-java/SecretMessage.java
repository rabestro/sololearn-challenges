public class SecretMessage {
    public static void main(String[] args) {
        
        new java.util.Scanner(System.in)
            .nextLine()
            .toLowerCase()
            .chars()
            .forEach(i -> {
                char encoded = (char)(i >= 'a' && i <= 'z' ? 'a' + 'z' - i : i);
                System.out.print(encoded);});
    }
}
