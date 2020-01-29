public class Divisible {
    public static void main(String[] args) {
        final var scan = new java.util.Scanner(System.in);
        final var number = scan.nextInt();
        scan.nextLine();
        
        final var isDivisible = scan
            .useDelimiter(" ")
            .tokens()
            .mapToInt(Integer::parseInt)
            .allMatch(i -> number % i == 0); 
           
        System.out.print(isDivisible ? "divisible by all" : "not divisible by all");
        scan.close();
    }
}
