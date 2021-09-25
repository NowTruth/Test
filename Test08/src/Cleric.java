public class Cleric {
	String name;
	static final int MAXHP = 50;
	int hp = 50;
	static final int MAXMP = 10;
	int mp = 10;
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.hp -= 5;
		this.hp = this.MAXHP;
		System.out.println("HPが最大まで回復した！");
	}
	
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天に祈った！");
		//理論上の回復量を乱数を用いて決定する
		int bonus = new java.util.Random().nextInt(2);
		//int recover = new Random().nextInt(3) + sec;
		
		//実際の回復量を決定する
		int mp = sec + bonus;
		if(mp > MAXMP) {
			mp = MAXMP;
		}
		//int recoverActual = Math.min(this.MAXMP - this.mp, recover);
		//this.mp += recoverActual;
		//System.out.println("MPが" + recoverActual + "回復した");
		//return recoverActual;
		return mp;
	}

}
