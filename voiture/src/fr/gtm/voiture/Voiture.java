package fr.gtm.voiture;

import java.util.Date; 
import static java.lang.Math.*;	//j'importe de manière statique (c à d QUE ce qui est static) tous les éléments de la classe Math

public class Voiture {
	// propriétés de la classe
	private String marque;
	//private int nbChevaux;
	private String couleur;
	private Moteur moteur;
	private Date premiereImmatriculation;
	
	
	public Voiture(String marque, String couleur, Moteur moteur) {
		//super();
		//Arrays;
		//java.sql.Date datesql;
		abs(-3);
		this.marque = marque;		//this :instance en cours de construction : j'utilise la propriété marque de l'objet en cours
		this.couleur = couleur;		// "." : permet d'accéder à la propriété de ma classe
		this.moteur = moteur;		//this fait la différence entre la propriété et la méthode
	}
	
	public Moteur getMoteur() {
		return moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", couleur=" + couleur + "]";
	}

	public void demarrer() {			
		System.out.println(marque);
		moteur.demarrer();
		//moteur.laisserChauffer();
		moteur.transmettreLaPuissance(23.6);
		
	}
	
	public void demarrer(int vitesse) {		//méthode demarrer en précisant la vitesse que je veux atteindre
		System.out.println("vitesse à atteindre : "+vitesse);	//surcharge car paramètre en trop
	}
	
}
