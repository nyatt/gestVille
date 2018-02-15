package gestville;

public class Starter {
 
	   public static void main(String[] args ){
		   
		   Ville v = new  Ville("Marseille",  12345678, "France", 'o');
		   Ville v1 = new Ville("Paris", 123456789, "France", 'p');
		   Ville v2 = new Ville("Limoges", 1234567, "France", 'q');
		   
		   System.out.println("\n\n"+v.describVille());
		   System.out.println(v.compare(v1));
		   System.out.println(v1.compare(v2));

		   }
	
}