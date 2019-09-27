package fr.gtm.voiture;

public abstract class Moteur {
	
	private int puissanceFiscale;
	private double autonomie;
	private static int compteur;
	
	public Moteur() {
		compteur++;
	}
	
	
	
	public void transmettreLaPuissance(double couple) {
		System.out.println(">>> couple : "+couple);
	}
	
	//public void demarrer() {				//méthode demarrer avec signature "demarrer"
		//System.out.println("Le moteur démarre");
	//}
	
	//public int demarrer(int i) {return 0;}
	
	//public void arreter() {
		//System.out.println("Le moteur s'arrête");
	//}
	
	public abstract void demarrer();		//La méthode est abstraite, elle n'a donc pas de code
	
	public abstract void arreter();			//méthode abstraite
	
	public double getAutonomie() {
		return autonomie;
	}
	public void setAutonomie(double autonomie) {
		this.autonomie = autonomie;
	}
	public int getPuissanceFiscale() {
		return puissanceFiscale;
	}



	public static int getCompteur() {
		return compteur;
	}



	public static void setCompteur(int compteur) {
		Moteur.compteur = compteur;
		
	}
	
	
	
}
