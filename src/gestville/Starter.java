package gestville;

public class Starter {
 
	   public static void main(String[] args ){
		   Ville ville = new  Ville();
		   System.out.println("le nobre d'instances de la classe ville est:" + Ville .getNbreInstancesBis());
		   Ville v = new  Ville("Marseille",  12345678, "France");
		   System.out.println("le nobre d'instances de la classe ville est:" + Ville .getNbreInstancesBis());
		   Ville v1 = new Ville("Paris", 123456789, "France");
		   System.out.println("le nobre d'instances de la classe ville est:" + Ville .getNbreInstancesBis());
		   Ville v2 = new Ville("Limoges", 1234567, "France");
		   System.out.println("le nobre d'instances de la classe ville est:" + Ville .getNbreInstancesBis());
		   
		   System.out.println("\n\n"+v.describVille());
		   System.out.println(v.compare(v1));
		   System.out.println(v1.compare(v2));

		   }
	
}