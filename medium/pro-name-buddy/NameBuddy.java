public final class NameBuddy {
    public static void main(String[] args) {
        System.out.print(
            new java.util.Scanner(System.in)
                .tokens()
                .map(name -> name.substring(0,1))
                .reduce(String::concat)
                .orElse("")
                .matches(".*(.).*\\1$")
                ? "Compare notes" 
                : "No such luck"
        );
    }
}
