public class EvenNumbers { 
    public static void main(String[] args) {
        final var in = new java.util.Scanner(System.in);
        
        java.util.stream.IntStream
            .generate(in::nextInt)
            .filter(i -> i % 2 == 0)
            .forEach(i -> System.out.printf("%d ", i));
    }
}
