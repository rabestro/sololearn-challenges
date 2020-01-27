public class FlowingWordsRE2 { 

    public static void main(String[] args) {
        
        System.out.print(!java.util.regex.Pattern
            .matches(".*((\\w)\\s+)(?!\\2).*", 
                new java.util.Scanner(System.in).nextLine()));
    }
}
