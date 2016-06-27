
public class Frame {
	private String colonne;
	private int ligne;
	private boolean targeted;
	private boolean hasShip;
	//private String couleur;	
	
	public Frame(String c, int l) {
		this.colonne = c;
		this.ligne = l;
		this.targeted = false;
		this.hasShip = false;
		//this.couleur = "noir";
	}
	
	public Frame(String c, int l, boolean ship) {
		this.colonne = c;
		this.ligne = l;
		this.targeted = false;
		this.hasShip = true;
		//this.couleur = "noir";
		
	}
	
	public boolean hasShip() {
		return this.hasShip;		
	}
	
	public boolean hasBeenTargeted() {
		return this.targeted;		
	}
	
	public void isTargeted() {
		this.targeted = true;		
	}
	
	/*private void hitFrame(boolean hit) {
		if (hit){
			this.couleur = "vert";
		} else {
			this.couleur = "rouge";
		}
	}*/
}


