
public class PoisonMatango extends Matango{
	int count;
	
	public PoisonMatango(char suffix) {
		super('A');
		this.count = 5;
	}
	
	public void attack(Hero h) {
		super.attack(h);
		System.out.println(h.name + "の体力は" + h.hp);
		
		if(this.count > 0) {
		System.out.println("さらに毒の胞子をばらまいた！");
		int dmg = h.hp / 5;
		h.hp = h.hp - dmg;
		System.out.println(h.hp + "ポイントのダメージ!");
		this.count--;
		System.out.println(h.name + "の体力は" + h.hp);
		System.out.println(this.count);
		}
	}

}
