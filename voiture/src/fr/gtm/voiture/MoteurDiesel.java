package fr.gtm.voiture;

public class MoteurDiesel extends Moteur {
	public final static int ALLUME = 1; //public utilisable en dehors de la class, static car ce sont les états possibles de la classe
	public final static int ETEINT = 2;	// final (au niv de la propriété) : on peut pas redéfinir la propriété
	private final int NB_CYLINDRES;	//final = le nbre de cylindre sera le même, il ne sera pas modifiable par la suite
									// les constantes sont tout en majuscules
	public MoteurDiesel() {			//final (au niv de la class) : on ne peut pas redéfinir la classe.
		NB_CYLINDRES = 4;
	}
	
	
	@Override						//regarde si dans la classe mère, si il y a bien la même signature ("démarrer")
	public void demarrer() {		//méthode abstraite : pas de code à l'intérieur.
		System.out.println("Le moteur diésel démarre");
	}

	@Override
	public void arreter() {
		System.out.println("Le moteur diésel s'arrête");	//la classe abstract n'a pas de code
		
	}
	
	
}
