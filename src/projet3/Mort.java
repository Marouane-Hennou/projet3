package projet3;

public class Mort extends Case{
	
	public Mort() {
		super(58);
	}
	
	protected Case arrivee(Oie oieEnJeu) {
		oieEnJeu.ajouterMessage("l'oie est sur la case Mort, retour à la case 1");
		return oieEnJeu.getPlateau().donnerCase(1);
	}
}
