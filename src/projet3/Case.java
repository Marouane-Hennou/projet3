package projet3;


public class Case {
	protected int numCase;

	public Case(int numCase) {
		this.numCase = numCase;
	}

	String getNom() {
		return("numero "+ numCase);
	}

	
	
	protected Case arrivee(Oie oieEnJeu){
		String nomCase = getNom();
		oieEnJeu.ajouterMessage("elle va sur la case " + nomCase + " ");
		return this;
	}
	
	
	protected Case caseSuivante(Oie oieEnJeu,int numCaseDestination){
		Plateau plateau = oieEnJeu.getPlateau();
		Case caseDestination = plateau.donnerCase(numCaseDestination);
		Case caseArrivee = caseDestination.arrivee(oieEnJeu);
		return caseArrivee;
	}
	
	Case depart(Oie oieEnJeu) {
		int valeurDes;
		Case caseArrivee;
		valeurDes = oieEnJeu.lancerDe();
		oieEnJeu.ajouterMessage("elle fait " + valeurDes);
		caseArrivee = caseSuivante(oieEnJeu, valeurDes + numCase);
		return caseArrivee;
	}
}
