import static java.lang.Integer.parseInt;

public class Balconies {
    public static void main(String[] args) {
    
        final var input = new java.util.Scanner(System.in);
        final var apartmentA = input.nextLine().split(",");
        final var apartmentB = input.nextLine().split(",");
        input.close();
        
        final int areaA = parseInt(apartmentA[0]) * parseInt(apartmentA[1]);
        final int areaB = parseInt(apartmentB[0]) * parseInt(apartmentB[1]);
        
        if (areaA > areaB) {
            System.out.print("Apartment A");
        } else {
            System.out.print("Apartment B");
        }
    }
}
