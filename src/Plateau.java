import java.util.ArrayList;

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
}
