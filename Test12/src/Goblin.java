
public class Goblin extends Monster {
	
	public Goblin(String name) {
		super.hp = 70;
		super.name = name;
	}
	
	public void run() {
		System.out.println(super.name + "はのそのそと逃げ出した！");
	}
}
