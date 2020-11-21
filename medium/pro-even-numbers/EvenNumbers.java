public final class EvenNumbers { 
    public static void main(String[] args) {
        
        new java.util.Scanner(System.in)
            .tokens()
            .mapToInt(Integer::parseInt)
            .filter(i -> i % 2 == 0)
            .forEach(i -> System.out.printf("%d ", i));
    }
}
