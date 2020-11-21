public final class YouTubeLinkFinder {
    public static void main(String[] args) {
        final var url = new java.util.Scanner(System.in).nextLine();
        final var videoId = url.replaceAll(".*[=/](.*)$", "$1");
        System.out.print(videoId);
    }
}
