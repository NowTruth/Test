
public class Wizard extends Character implements Life {
	
	public Wizard(String name) {
		super.hp = 200;
		super.name = name;
	}
	
	public void run() {
		System.out.println(super.name + "は飛んで逃げ出した!");
	}
	
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した!");
	}
}
