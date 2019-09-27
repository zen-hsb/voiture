package fr.gtm.voiture;

public class Calcul {
	public static double add(double...a) {	//compilateur va me donner un nombre infini de double
		double r = 0;						//raccourci vers un tableau
		for(double d : a)
			r += d;
		return r;
		
	}
}
	
