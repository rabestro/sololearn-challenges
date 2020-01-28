public class JungleCamping {

    public static void main(String[] args) {
	    
        new java.util.Scanner(System.in)
            .tokens()
            .map(java.util.Map
                .of("Grr", "Lion ", "Rawr", "Tiger ", "Ssss", "Snake ", "Chirp", "Bird ")::get)
            .forEach(System.out::print);
    }
}
