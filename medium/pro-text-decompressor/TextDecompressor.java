public final class TextDecompressor {
    public static void main(String[] args) {

        new java.util.Scanner(System.in)
                .useDelimiter("(?<=\\d)")
                .tokens()
                .map(x -> x.substring(0, 1).repeat(Integer.parseInt(x.substring(1))))
                .forEach(System.out::print);
    }
}
