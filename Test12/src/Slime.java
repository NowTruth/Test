
public class Slime extends Monster{
	
	public Slime(String name) {
		super.hp = 50;
		super.name = name;
	}
	
	public void run() {
		System.out.println("スライムはサササッと逃げ出した。");
	}
}
