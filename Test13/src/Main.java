
public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.setName("zero");
		
		Wand x = new Wand();
		Wizard w = new Wizard();
		w.setWand(x);
	}

}
