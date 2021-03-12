package Etudiant;

public class Panda {
	private int tailleP;
	private int ageP;
	private String nomP;
	private String PouvoirP;
	private String universP;
	
	public Panda(int tailleP, int ageP, String nomP, String PouvoirP, String universP) {
		this.tailleP = tailleP;
		this.ageP = ageP;
		this.nomP = nomP;
		this.PouvoirP = PouvoirP;
		this.universP = universP;
	}
	
	public String getNom() {
		return nomP;
	}
	
	public void sePresenter() {
		System.out.println("Je mappelle " + nomP + " je viens de l'univers " + universP + ". Je mesure " + tailleP + "cm et j'ai " + ageP + " ans. " + PouvoirP + ", est mon Pouvoir !");
	}
	
	public String toString() {
		return nomP + " " + PouvoirP;
	}
}
