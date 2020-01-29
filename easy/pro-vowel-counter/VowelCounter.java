import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        
        long vowels = new Scanner(System.in)
            .nextLine()
            .chars()
            .filter(c -> "AEIOUaeiou".indexOf(c) != -1)
            .count();
        
        System.out.println(vowels);
    }
}
