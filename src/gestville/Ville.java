package gestville;

public class Ville {
	private String nomVille;
	private String nomPays;
	private int nbreHabitants;
	private char categorie;
	
	//constructeur
	public Ville (){
	     System.out.println("Creeation d'une Ville");
	     this.setNomVille("nomVille");
	     this.setNomPays("nomPays");
	     this.setNbreHabitants(15);
	     this.setCategorie(categorie);
	}
	
	//constructeur avec paramtres 
	public Ville (String nomVille, int i, String nomPays) {
		System.out.println("Creeation dune Ville avec parametre");
		this.setNomVille(nomVille);
		this.setNomPays(nomPays);
		this.setNbreHabitants(i);
		this.setCategorie(categorie);
	}
	
	//determine la categorie de laville 
	private void  typeCategorie(){
	  int nbre []= {10,20,30,40,50};
	  char categories[] = {'A','B','C','D','E'};
	  int i = 0;
	while (i<nbre.length && this.nbreHabitants<= nbre[i] )
		i++;
		this.categorie = categories[i];
	}
	
	//description de la ville
	public String describVille(){
		return "\t"+ this.nomVille + " est une ville de "+ this.nomPays + " et comporte: "+this.nbreHabitants +" habitants "+ " Donc ca categorie est:" + this.categorie;
	}
	
	
	//comprarer deux ville 
	 public String compare (Ville V1){
		 String str = new String();
		 if (V1.getNbreHabitants() > this.nbreHabitants)
			 str = V1.getNomVille() + " est la ville la plus peuplée " + "que" + this.nomVille;
		 else 
			 str = this.nomVille + " est la ville la plus peuplée que " + V1.getNomVille(); 
			 return "\t" + str;
	 }
	 
	 
    //getters and setters 
	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public int getNbreHabitants() {
		return nbreHabitants;
	}

	public void setNbreHabitants(int nbreHabitants) {
		this.nbreHabitants = nbreHabitants;
	}

	public char getCategorie() {
		return categorie;
	}

	public void setCategorie(char categorie) {
		this.categorie = categorie;
	}



}
