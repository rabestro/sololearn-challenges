public final class NameBuddyRegEx {
    public static void main(String[] args) {
        final var scanner = new java.util.Scanner(System.in);
        final var members = scanner.nextLine();
        final var myName = scanner.nextLine();
        final var isCompare = members.matches(".*\\b" + myName.charAt(0) + ".*");
        
        System.out.print(isCompare ? "Compare notes" : "No such luck");
    }
}
