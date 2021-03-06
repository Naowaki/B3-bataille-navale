import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Plateau {
	private ArrayList<Frame> cases;
	
	public Plateau() {
		this.cases = new ArrayList<Frame>();
		
		String[] lettres = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		
		for (int i = 1; i <= 10; i++) {
			for (String a: lettres) {
				this.cases.add(new Frame(a, i));
			}
		}
	}
	
	public void setShipPosition(Bateau b, String coord, Boolean horizontal) {
		int taille = b.getShip().getTaille();
		List<String> lettres = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
		
		ArrayList<Frame> frames = new ArrayList<Frame>();
		
		Frame f = new Frame(coord.split(":")[0], Integer.parseInt(coord.split(":")[1]), true);
		frames.add(f);
		
		if (horizontal) {
			for (int i = lettres.indexOf(coord.split(":")[0]) ; i < lettres.indexOf(coord.split(":")[0]) + taille ; i++){
				Frame frame = new Frame(lettres.get(i), Integer.parseInt(coord.split(":")[1]), true);
				frames.add(frame);
			}
		} else {
			for (int i = Integer.parseInt(coord.split(":")[1]) ; i < Integer.parseInt(coord.split(":")[1]) + taille ; i++){
				Frame frame = new Frame(coord.split(":")[0], i, true);
				frames.add(frame);
			}
		}
		
		b.getShip().setCasesOccupees(frames);
	}
	
	public Frame frameAttacked(String coord) {
		return new Frame(coord.split(":")[0], Integer.parseInt(coord.split(":")[1]));		
	}
}
