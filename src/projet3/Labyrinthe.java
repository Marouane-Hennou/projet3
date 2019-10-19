package projet3;

public class Labyrinthe extends Case{

	public Labyrinthe() {
		super(42);
	}
	
	protected Case arrivee(Oie oieEnJeu){
		oieEnJeu.ajouterMessage("elle tombe sur la casse labyrinthe et elle va à la case 30");
		return oieEnJeu.getPlateau().donnerCase(30);
	}
}
