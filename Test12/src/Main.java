
public class Main {
	public static void main(String[] args) {
		/*
		Slime s = new Slime();
		Monster m = new Slime();
		s.run();
		m.run();
		*/
		
		Character[] c = new Character[5];
		c[0] = new Hero("ヒーロー1");
		c[1] = new Hero("ヒーロー2");
		c[2] = new Thief("泥棒3");
		c[3] = new Wizard("魔法使い4");
		c[4] = new Wizard("魔法使い5");
		
		//宿に泊まる
		for(Character ch : c) {
			ch.hp += 50;
			System.out.println(ch.name + "の体力は" +ch.hp);
		}
		
		//撤退
		for(Character ch2 : c) {
			ch2.run();
		}
		
		
		Monster[] monsters = new Monster[3];
		monsters[0] = new Slime("スライム");
		monsters[1] = new Goblin("ゴブリン");
		monsters[2] = new DeathBat("デスバット");
		
		for(Monster m : monsters) {
			m.run();
		}
		
	}
}
