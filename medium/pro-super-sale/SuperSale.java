public class SuperSale {
    public static void main(String[] args) {
        System.out.print((int)(0.3 * 1.07 
                * -new java.util.Scanner(System.in)
			.useDelimiter(",")
			.tokens()
			.mapToDouble(Double::parseDouble)
			.map(x -> -x)
			.sorted()
			.skip(1)
			.sum())
	);
    }
}
