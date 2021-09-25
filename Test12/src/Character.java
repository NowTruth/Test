
public abstract class Character {
	String name;
	int hp;
	
	public void attack() {
		System.out.println(this.name + "は攻撃した！");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げた！");
	}
}
