public class NameBuddy {
    public static void main(String[] args) {
           
        System.out.print(java.util.regex.Pattern.matches(".*(.).*\\1$",
            new java.util.Scanner(System.in)
                .useDelimiter("\\s")
                .tokens()
                .map(name -> name.substring(0,1))
                .reduce(String::concat)
                .orElse("")) ? "Compare notes" : "No such luck");
    }
}
