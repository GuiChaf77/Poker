package Poker;

// classe joueur d�finis par nom, prenom, nombre de jetons, et ses 2 cartes en sous classe
public class Joueur {
	
	String nom;
	String prenom;
	int nbjetons;
	Carte C1;
	Carte C2;
	
	public Joueur(String prenom, String nom, int nbjetons){
		
		this.nom = nom;
		this.prenom = prenom;
		this.nbjetons = nbjetons;
		this.C1 = null;
		this.C2 = null;
	}
	

	public String toString(){
		
		if  (this.nbjetons <=2){
		return (this.prenom + " " + this.nom + " poss�de " + this.nbjetons + " jeton." + "\n" 
		+ "Ses cartes sont le " + this.C1 + " et le " + this.C2 + ".");
	}
		else{
			return (this.prenom + " " + this.nom + " poss�de " + this.nbjetons + " jetons." + "\n" 
					+ "Ses cartes sont le " + this.C1 + " et le " + this.C2 + ".");
		}
	}	
}
