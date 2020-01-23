import static java.util.stream.Collectors.averagingInt;

public class AverageWordLengthStream
{
    public static void main(String[] args) {
        
        final int average = (int) Math.ceil( 
            new java.util.Scanner(System.in)
                .useDelimiter("[,.!? ]+")
                .tokens()
                .collect(averagingInt(String::length)));
             
        System.out.print(average);
    }
}
