
public class Thief extends Character{
	
	public Thief(String name) {
		super.hp = 100;
		super.name = name;
	}
	
	public void run() {
		System.out.println(super.name + "はひっそりと逃げ出した。");
	}
}
