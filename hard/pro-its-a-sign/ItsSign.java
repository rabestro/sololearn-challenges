public class ItsSign {
    public static void main(String[] args) {
        System.out.println(
                new java.util.Scanner(System.in)
                        .tokens()
                        .limit(4)
                        .map(StringBuilder::new)
                        .anyMatch(w -> w.toString().equals(w.reverse().toString())) 
                        ? "Open" 
                        : "Trash"
        );
    }
}
