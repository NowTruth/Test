
public class Main {
	public static void heal(int hp) {
		hp += 10;
	}
	public static void heal(Thief thief) {
		thief.hp += 10;
	}
	
	public static void main(String[] args) {
		
		int baseHp = 25;
		Thief t = new Thief("アサカ", baseHp);
		System.out.println(baseHp + ":" + t.hp);
		heal(baseHp);
		heal(t);
		System.out.println(baseHp + ":" + t.hp);
		
		/*
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero("ミナト");
		h.sword = s;
		System.out.println(h.name + "の体力は" + h.hp);
		System.out.println("現在の武器は" + h.sword.name);
		
		Hero h1 = new Hero();
		h1.name = "ナルト";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		System.out.println(h1.name + "の体力は" + h1.hp);
		System.out.println(h2.name + "の体力は" + h2.hp);
		*/
		
		
	}

}
