public class NewDriversLicense {
    public static void main(String[] args) {
        var input = new java.util.Scanner(System.in);
        var hero = input.next();
        var agents = input.nextInt();
        
        var position = input.tokens().filter(person -> person.compareTo(hero) < 0).count();
        var time = 20 * (1 + position / agents);
        
        System.out.print(time);
    }
}
