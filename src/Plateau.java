import java.util.HashMap;
import java.util.Map;

public class Plateau {
	private Map<String, Integer> cases;
	private Map<Map, Boolean> cibles;
	
	public Plateau() {
		this.cases = new HashMap<String, Integer>();
		this.cibles = new HashMap<Map, Boolean>();
	}
}
