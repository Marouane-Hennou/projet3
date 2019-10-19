package projet3;

import java.util.Random;

public class De {
	public int lancer() {
		Random rand = new Random();
		int lancee;
		lancee = rand.nextInt(6)+1+rand.nextInt(6)+1;
		return lancee;
	}
}
