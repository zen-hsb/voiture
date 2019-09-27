package fr.gtm.voiture;

public interface LecteurCassette {
	int START = 1;
	public static final int STOP = 2; //pas obligé de mettre/préciser si "public", "static", ou "final".
	
	public abstract void setState(int state);
	default void set4Pistes() {
		
	}
	
	
}


