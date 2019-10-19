package projet3;

public class Hotel extends Case{
	private int tourPasse;
	
	public Hotel() {
		super(19);
		tourPasse=2;
	}
	
	protected Case arrivee(Oie oieEnJeu) {
		Hotel h = new Hotel();
		oieEnJeu.ajouterMessage("tombe sur la case hotel et ne joue pas pendant 2 tours ");
		return h;
	}
	
	public Case depart(Oie oieEnJeu){
		String couleurOie = oieEnJeu.getCouleur();
		int valeurDes;
		Case caseArrivee;
		if (tourPasse > 0){
			oieEnJeu.ajouterMessage("L'oie " + couleurOie + " est a l'hotel pour encore " + tourPasse + " tours");
			tourPasse--;
			return this;
		}
		else{
			oieEnJeu.ajouterMessage("L'oie " + couleurOie + " est sur la case hotel");
			valeurDes = oieEnJeu.lancerDe();
			oieEnJeu.ajouterMessage("elle fait " + valeurDes + " ");
			caseArrivee = caseSuivante(oieEnJeu, valeurDes + numCase);
			return caseArrivee;
		}
	}
	
}

