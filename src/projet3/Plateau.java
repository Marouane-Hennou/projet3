package projet3;

import projet3.Case;

public class Plateau {
	public static final int NB_CASES=63;
	protected Case [] cases = new Case [NB_CASES];
	
	public Plateau() {
		for (int i = 0; i<NB_CASES;i++)
			cases[i] = new Case(i + 1) ;
		initialiserCaseSpecifiques();
	}
	
	Case donnerCase(int numCase) {
		if (numCase>63)
			return (cases[numCase-63]);
		else
			return (cases[numCase-1]);
	}
	
	Case CaseDebutPartie() {
		return cases[0];
	}
	
	private void initialiserCaseSpecifiques(){
		cases[51] = new Prison();
		cases[57] = new Mort();
		cases[30] = new Puit();
		cases[5] = new Pont();
		cases[41] = new Labyrinthe();
		cases[18] = new Hotel();
		cases[62] = new Jardin();
		for (int i = 9; i <= 54; i=i+9) {
			cases[i-1]=new Faste(i);}
		
	}
	
}
