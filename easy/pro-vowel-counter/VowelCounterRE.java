import java.util.Scanner;

public class VowelCounterRE {
    public static void main(String[] args) {
        
        long vowels = new Scanner(System.in)
            .nextLine()
            .replaceAll("[^AEIOUaeiou]", "")
            .length();
        
        System.out.println(vowels);
    }
}
