package fr.gtm.voiture;

public class MainVoiture {
	
		public static void main(String[] args) {
			Voiture v1 = new Voiture("Porsche","bleu",new MoteurDiesel());
			Voiture v2 = v1;
			
			//Moteur m = new MoteurDiesel();
			
			//v1.setMarque("Porsche");
			//v1.setNbChevaux(110);
			//v1.setCouleur("bleu");
			//System.out.println(v1);
			//System.out.println(v2);
			
			//m.arreter();
			//v1.demarrer();
			
			for(int i=0 ; i<10 ; i++) {
				Moteur m = new MoteurDiesel();
				//System.out.println("nombre de moteurs : "+m.getCompteur());
			}
			System.out.println("nombre de moteurs : "+Moteur.getCompteur());
			
			
			double r = Calcul.add(new double[] {12.3,6.5,8.3,7.5});
			
		}

}
