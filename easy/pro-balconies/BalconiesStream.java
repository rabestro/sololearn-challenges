import java.util.Scanner;
import java.util.stream.Stream;

public class Balconies {
    public static void main(String[] args) {
    
        final var input = new Scanner(System.in);
        
        final int areaApartmentA = 
            Stream.of(input.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .reduce((height, width) -> height * width).orElse(0);
        
        final int areaApartmentB = 
            Stream.of(input.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .reduce((height, width) -> height * width).orElse(0);
        
        input.close();
        
        if (areaApartmentA > areaApartmentB) {
            System.out.print("Apartment A");
        } else {
            System.out.print("Apartment B");
        }
    }
}
