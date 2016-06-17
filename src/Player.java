import java.util.ArrayList;

public class Player {

	private ArrayList<Bateau> bateaux;

	private Plateau monplat;
	
	public void PoserBateau(Bateau bat,String caseDepart,Boolean direction){
	//this.monplat.setShipPosition(bat,caseDepart,direction);
	}
	public ArrayList<Bateau> getBateaux() {
		return bateaux;
	}

	public void setBateaux(ArrayList<Bateau> bateaux) {
		this.bateaux = bateaux;
	}
	public Plateau getMonplat() {
		return monplat;
	}
	public void setMonplat(Plateau monplat) {
		this.monplat = monplat;
	}
}
