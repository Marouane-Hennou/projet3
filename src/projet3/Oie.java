package projet3;

public class Oie {
	private String couleur;
	private De des;
	private Plateau plateau;
	private Journal info ;
	private Case casePlateau;

	public Oie(String couleur, Plateau plateau, De des) {
		this.couleur = couleur;
		this.des = des;
		this.plateau = plateau;
		this.info=new Journal();
		this.casePlateau = plateau.CaseDebutPartie();
		
		
	}

	public String getCouleur() {
		return couleur;
	}
	
	public Plateau getPlateau() {
		return plateau;
	}
	

	
	public int lancerDe() {
		return des.lancer();
		
	}
	
	public void ajouterMessage(String nouveauMess) {
		info.ajouterMessage(nouveauMess);
		
	
	}
	
	public Boolean action() {
		this.ajouterMessage("L'oie " + couleur + " est sur la case " + casePlateau.getNom() + " ");
		casePlateau = casePlateau.depart(this);
		info.afficherMessage();
		return (casePlateau == null);
	}
	
}
