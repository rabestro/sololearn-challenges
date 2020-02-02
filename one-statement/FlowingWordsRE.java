public class FlowingWordsRE { 
    public static void main(String[] args) {
        
        System.out.print(java.util.regex.Pattern
            .matches("^(\\w*(\\w)\\s+\\2\\w*)+$", 
                new java.util.Scanner(System.in).nextLine()));
    }
}
