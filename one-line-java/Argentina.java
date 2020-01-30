public class Argentina {
    public static void main(String[] args) {
    
        System.out.print(
            new java.util.Scanner(System.in)
                .tokens()
                .mapToInt(Integer::parseInt)   
                .reduce((pesos, dollars) -> dollars * 50l > pesos ? 0: -1)
                .orElse(0) == 0 ?  "Pesos" : "Dollars"
        );
    }
}
