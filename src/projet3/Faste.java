package projet3;

public class Faste extends Case{
	
	
	public Faste(int numCase) {
		super(numCase);
	}
	
	public String getNom() {
		return ("Faste");
	}
	
	protected Case arrivee(Oie oieEnJeu) {
		String nomCase=getNom();
		oieEnJeu.ajouterMessage("elle tombe sur une case " + nomCase + " et rejoue ! ");
		return this.depart(oieEnJeu);
		}
}
