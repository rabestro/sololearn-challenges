public class FlowingWords { 
    public static void main(String[] args) {
        System.out.println(!new java.util.Scanner(System.in).nextLine().matches(".*((\\w)\\s+)(?!\\2).*"));
    }
}
