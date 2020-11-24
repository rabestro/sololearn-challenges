public final class NewDriversLicense {
    public static void main(String[] args) {
        final var scanner = new java.util.Scanner(System.in);
        final var hero = scanner.next();
        final var agents = scanner.nextInt();
        final var position = scanner
                .tokens()
                .filter(person -> person.compareTo(hero) < 0)
                .count();
        
        final var time = 20 * (1 + position / agents);
        
        System.out.print(time);
    }
}
