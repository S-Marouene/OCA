package formation_oca.chapter1;

public class Personne {
	/* attribut d'instance */
	
	String nom;
	int age;
	double moy;
	
	
	/* attribut dde class */
	
	
	public Personne(String nom) {
		System.out.println("Constructeur avec parametre ");
		this.nom = nom;
	}

	
	public Personne() {
		System.out.println("Constructeur par defaut");
		
	}
	
	public Personne(String nom, int age , double moy) {
		System.out.println("Constructeur avec 3 parametre ");
		this.nom = nom;
		this.moy = moy;
		this.age = age;
		
	}

	/* methode dinstance */
	public void info () {
		
	}
	
	static void affichage() {
		System.out.println("Constructeur par defaut");
	}
}
