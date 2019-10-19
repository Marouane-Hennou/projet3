package projet3;

public class Pont extends Case {

	public Pont() {
		super(6);
	}
	
	protected Case arrivee(Oie oieEnJeu) {
		oieEnJeu.ajouterMessage("elle tombe sur la case pont et elle va à la case 12");
		return oieEnJeu.getPlateau().donnerCase(12);
		
	}
}
