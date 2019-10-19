package projet3;

public class Jardin extends Case {

	public Jardin() {
		super(63);
	}
	
	protected Case arrivee(Oie oieEnJeu) {
		oieEnJeu.ajouterMessage("arrive au jardin et gagne");
		return null;
	}
}
