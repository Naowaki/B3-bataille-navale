import java.util.ArrayList;

public class Bateau {
	private Ship ship;
	
	public Bateau(Ship ship){
		this.setShip(ship);
	}

	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}
}

enum Ship
{
    // Il faut appeler l'un des constructeurs déclarés :
	AIRCRAFT("Aircraft carrier",5),
	BATTLESHIP("Battleship",4),
	CRUISER("Cruiser",3),
	DESTROYER("Destroyer",2),
	SUBMARINE("Submarine",1);

    // Membres :
    private String nom;
    private Integer taille;
    private ArrayList<Frame> casesOccupees;
    

    Ship(String nom, Integer taille)
    {
        this.nom = nom;
        this.taille = taille;
    }

    public String getNom(){ return this.nom; }
    public Integer getTaille(){ return this.taille; }

	public ArrayList<Frame> getCasesOccupees() {
		return casesOccupees;
	}

	public void setCasesOccupees(ArrayList<Frame> casesOccupees) {
		this.casesOccupees = casesOccupees;
	}
}