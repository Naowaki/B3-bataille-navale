import java.util.ArrayList;

public class Player {

	private ArrayList<Bateau> bateaux;
	private String nom;
	private Plateau monplat;

	
	public Player(String n,Plateau plat){
		this.setNom(n);
		this.setMonplat(plat);
		ArrayList<Bateau> mesBats = new ArrayList<Bateau>();
			Bateau ai = new Bateau(Ship.AIRCRAFT);
			Bateau bat = new Bateau(Ship.BATTLESHIP);
			Bateau cru = new Bateau(Ship.CRUISER);
			Bateau dest = new Bateau(Ship.DESTROYER);
			Bateau sb = new Bateau(Ship.SUBMARINE);
			mesBats.add(ai);
			mesBats.add(bat);
			mesBats.add(cru);
			mesBats.add(dest);
			mesBats.add(sb);
		this.setBateaux(mesBats);
		
		this.PoserBateaux();
	}
	
	
	public void PoserBateaux(){
		for(Bateau bat : this.bateaux){
			System.out.println(nom);
			//this.monplat.setShipPosition(bat,caseDepart,direction);
		}
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
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
