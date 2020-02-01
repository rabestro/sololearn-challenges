import java.util.Scanner;

public class YouTubeLinkFinder {
    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var url = input.nextLine();
        input.close();
        
        final var videoId = url.replaceAll(".*[=/](.*)$", "$1");
        
        System.out.print(videoId);
    }
}
