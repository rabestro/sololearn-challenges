public class FlowingWords { 
    public static void main(String[] args) {
        
        System.out.print(!new java.util.Scanner(System.in)
            .tokens()
            .reduce((a, b) -> a = !a.isEmpty() && a.endsWith(b.substring(0,1)) ? b : "")
            .get()
            .isEmpty());
    }
}
