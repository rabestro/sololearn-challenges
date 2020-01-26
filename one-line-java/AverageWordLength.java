public class AverageWordLength {
    public static void main(String[] args) {
        
        System.out.print((int)Math.ceil( 
            new java.util.Scanner(System.in)
                .useDelimiter("\\W+")
                .tokens()
                .collect(java.util.stream.Collectors.averagingInt(String::length))));
    }
}
