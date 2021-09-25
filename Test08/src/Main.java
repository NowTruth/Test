public class Main {
	public static void main(String[] args) {
		//1.勇者を生成
		Hero h = new Hero();
		//2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");
		
		/*
		//3.勇者のメソッドを呼び出してゆく
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		*/
		
		//4.お化けキノコを生成
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		//5.冒険の始まり
		h.slip();
		m1.run();
		m2.run();
		h.run();
	}

}
