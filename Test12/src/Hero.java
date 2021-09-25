
public class Hero extends Character{

	
	public Hero(String name) {
		super.hp = 300;
		super.name = name;
	}
	
	public void run() {
		System.out.println(super.name + "はダッシュで逃げ出した！！！");
	}
	
	public void attack(Monster m) {
		System.out.println(super.name + "は攻撃した");
		System.out.println("敵に5ポイントのダメージを与えた！");
		m.hp -= 10;
	}
	
}
