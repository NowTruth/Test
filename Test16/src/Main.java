import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("齋藤");
		Hero h2 = new Hero("鈴木");
		
		Map<Hero, Integer>heroes = new HashMap<Hero, Integer>();
		heroes.put(h1, 3);
		heroes.put(h2, 7);
		
		for(Hero key : heroes.keySet()) {
			int value = heroes.get(key);
			System.out.println(key.getName() + "が倒した敵=" + value);
		}
		
		/*
		Hero h1 = new Hero("齋藤");
		Hero h2 = new Hero("鈴木");
		List<Hero> heroes = new ArrayList<Hero>();
		heroes.add(h1);
		heroes.add(h2);
		for(Hero h : heroes) {
			System.out.println(h.getName());
		}
		*/
		
	}
}
