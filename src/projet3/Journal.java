package projet3;

public class Journal {
	
	String message=" ";
	
	public void ajouterMessage(String nouveauMess) {
		this.message=this.message+" " + nouveauMess;
	}
	
	public void afficherMessage() {
		System.out.println(message);
		this.message=" ";
	}

}
