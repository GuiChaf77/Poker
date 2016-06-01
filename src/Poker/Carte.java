package Poker;


// classe carte compos� de la valeur de la carte (as, roi, 2, 3...) et du type (coeur carreaux...) ils sont d�finis
//par un entier qui ira ensuite chercher les valeurs r�elles dans les tableaux
public class Carte {
	
	String symbCarte[] = {"Coeur", "Pique", "Carreau", "Tr�fle"};
	String valCarte[] = {"2","3","4","5","6","7","8","9","10","Valet","Dame","Roi","As"};
	int numsymb;
	int numval;
	
	public Carte(int numsymb, int numval){
		
		this.numsymb = numsymb;
		this.numval = numval;
	}
	
	public Carte(Carte C1){
		
		this(C1.numsymb, C1.numval);
	}
	
	public String toString(){
		
		return (this.valCarte[numval] + " de " + this.symbCarte[numsymb]);
		
	}
	
	public String getsymb(int x){
		
		return symbCarte[x];
	}
	
	public String getVal(int x){
		
		return valCarte[x];
	}
	

}
