public final class Multiples { 
    public static void main(String[] args) {
        System.out.print(java.util.stream.IntStream
            .range(3, new java.util.Scanner(System.in).nextInt())
            .filter(i -> i % 3 == 0 || i % 5 == 0)
            .sum()
        );
    }
}
