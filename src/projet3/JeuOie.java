package projet3;

public class JeuOie {  
	  private Oie[] oies;  
	  private int nbOie = 0;  
	  private Plateau plateau = new Plateau();
	  private De de = new De();
	  
	  public JeuOie(int nbOieMax) {    
	    oies = new Oie[nbOieMax];
	  }

	  public void ajouterOie(String couleur) {  
	    if (nbOie < oies.length) {
	      oies[nbOie] = new Oie(couleur, plateau, de);
	      nbOie++;
	    }
	  }

	  public void jouer() {
		  boolean finPartie = nbOie < 2;
			for ( ; !finPartie; ){
				for (int i = 0 ; !finPartie && i < nbOie  ; i++){
					finPartie = oies[i].action();
				}
			}
	  }

	}