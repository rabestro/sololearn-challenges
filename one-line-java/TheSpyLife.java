public class TheSpyLife
{
    public static void main(String[] args) {
        
        System.out.println(
            new StringBuilder(new java.util.Scanner(System.in).nextLine())
                .reverse()
                .toString()
                .replaceAll("[^a-zA-Z ]", ""));
    }
}
