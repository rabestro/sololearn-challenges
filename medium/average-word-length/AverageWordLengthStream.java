import static java.util.stream.Collectors.*;

public class AverageWordLength
{
    public static void main(String[] args) {
        
        final int average = (int) Math.ceil( 
            new java.util.Scanner(System.in)
                .useDelimiter("\\W+")
                .tokens()
                .collect(averagingInt(String::length)));
             
        System.out.print(average);
    }
}
