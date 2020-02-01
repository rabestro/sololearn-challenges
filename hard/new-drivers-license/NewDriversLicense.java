public class NewDriversLicense {
    public static void main(String[] args) {
        final var input = new java.util.Scanner(System.in);
        final var hero = input.next();
        final var agents = input.nextInt();
        
        final var position = input.tokens().filter(person -> person.compareTo(hero) < 0).count();
        final var time = 20 * (1 + position / agents);
        
        System.out.print(time);
        input.close();
    }
}
