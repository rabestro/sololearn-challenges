public class HowFar {
    public static void main(String[] args) {
        
        System.out.println(
           new java.util.Scanner(System.in)
               .nextLine()
               .replaceAll("B*[PH](B*)[HP]B*", "$1")
               .length());
    }
}
