public class TaxFree {
    public static void main(String[] args) {
           
        System.out.printf("%.2f", 
            new java.util.Scanner(System.in)
                .useDelimiter(",")
                .tokens()
                .mapToInt(Integer::parseInt)
                .mapToDouble(i -> i < 20 ? i * 1.07 : i)
                .sum());
    }
}
