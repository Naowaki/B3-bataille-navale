import java.util.HashMap;
import java.util.Map;

public class Plateau {
	private Map<String, Integer> cases;
	private Map<Map<String, Integer>, Boolean> cibles;
	
	public Plateau() {
		this.cases = new HashMap<String, Integer>();
		this.cibles = new HashMap<Map<String, Integer>, Boolean>();
		
		String[] lettres = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		
		for (int i = 1; i <= 10; i++) {
			for (String a: lettres) {
				this.cases.put(a, i);
			}
		}
	}
}
