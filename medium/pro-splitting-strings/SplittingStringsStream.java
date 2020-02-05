import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class SplittingStringsStream
{
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var text = input.nextLine();
        final var n = input.nextInt();
        final var len = text.length();
        
        var separated = IntStream
            .range(0, (len % n > 0 ? 1 : 0) + len / n)
            .mapToObj(i -> text.substring(i * n, Math.min(n + i * n, len)))
            .collect(Collectors.joining("-"));
            
        System.out.print(separated);
   }
}
