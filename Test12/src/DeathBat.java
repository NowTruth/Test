
public class DeathBat extends Monster {
	
	public DeathBat(String name) {
		super.hp = 30;
		super.name = name;
	}
	
	public void run() {
		System.out.println(super.name + "は飛んでいった。");
	}
}
