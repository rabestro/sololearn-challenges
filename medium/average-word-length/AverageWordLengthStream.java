import static java.util.stream.Collectors.averagingInt;

public final class AverageWordLengthStream {
    public static void main(String[] args) {
        System.out.print((int) Math.ceil(
                new java.util.Scanner(System.in)
                        .useDelimiter("\\W+")
                        .tokens()
                        .collect(averagingInt(String::length)))
        );
    }
}
