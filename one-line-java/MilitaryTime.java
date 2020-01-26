public class MilitaryTime {
    public static void main(String[] args) {

        System.out.println(java.time.LocalTime.parse(
            new java.util.Scanner(System.in).nextLine(), 
                java.time.format.DateTimeFormatter
                    .ofLocalizedTime(java.time.format.FormatStyle.SHORT)
                    .withLocale(java.util.Locale.US)));
    }
}
