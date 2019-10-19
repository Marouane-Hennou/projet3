package projet3;


public class Test {
	public static void main(String argv[]) {
		JeuOie jeuOie = new JeuOie(3); 
    	jeuOie.ajouterOie("verte");
    	jeuOie.ajouterOie("jaune");
	    jeuOie.ajouterOie("bleu");
	    jeuOie.jouer();
	}

}
