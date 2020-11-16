public final class HalloweenCandy {
    public static void main(final String[] args) {
        final var houses = new java.util.Scanner(System.in).nextInt();
        
        final var percentage = (int) Math.ceil(200. / houses);
       
        System.out.print(percentage);
    }
}
