public class DejaVu {
    public static void main(String[] args) {  
       System.out.println(
           new java.util.Scanner(System.in)
	       .nextLine()
	       .matches(".*(.).*\\1.*") ? "Deja Vu" : "Unique"
       );
    }
}
