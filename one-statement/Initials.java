public class Initials {
    public static void main(String[] args) {
    
        new java.util.Scanner(System.in)
                .useDelimiter("\\v+")
                .tokens()
                .skip(1)
                .map(name -> name.replaceAll("^(.).* (.).*$", "$1$2 "))
                .forEach(System.out::print);
    }
}
