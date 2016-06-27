public class Main {

	public static void main(){
		Plateau platoJ1 = new Plateau();
		Plateau platoJ2 = new Plateau();
		Player Joueur1 = new Player("Jean-Charle", platoJ1);
		Player Joueur2 = new Player("In the Navy", platoJ2);
		/*rajout de .Travis.yml*/
		while(Joueur1.getBateaux().size() != 0 && Joueur2.getBateaux().size() != 0 ){
			
		}
		if (Joueur1.getBateaux().size() == 0){
			//log Joueur 1 lose
		}else{
			if(Joueur2.getBateaux().size() == 0){
				//log Joueur 2 lose
			}
		}
	}
}
