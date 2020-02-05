public class TextDecompressor2 {
    public static void main(String[] args) {

        new java.util.Scanner(System.in)
                .useDelimiter("(?<=\\d)")
                .tokens()
                .map(x -> x.substring(0, 1).repeat(x.charAt(1) - '0'))
                .forEach(System.out::print);
    }
}
