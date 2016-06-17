
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
    private final String nom;
    private final Integer taille;

    Ship(String nom, Integer taille)
    {
        this.nom = nom;
        this.taille = taille;
    }

    public String getNom(){ return this.nom; }
    public Integer getTaille(){ return this.taille; }
}