
public class Frame {
	private String colonne;
	private int ligne;
	private boolean targeted;
	private String couleur;	
	
	public Frame(String c, int l){
		this.colonne = c;
		this.ligne = l;
		this.targeted = false;
		this.couleur = "noir";
	}
	
	private void hitFrame(boolean hit) {
		if (hit){
			this.couleur = "vert";
		} else {
			this.couleur = "rouge";
		}
	}
}


