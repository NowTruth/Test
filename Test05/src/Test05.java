public class Test05 {
	/*
	public static void main(String[] args) {
		
		System.out.println("メソッドを呼び出します");
		hello("湊");
		hello("朝香");
		hello("菅原");
		System.out.println("メソッドの呼び出しが終わりました");
		
	}
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}
	*/
	/*
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
	
	public static void main(String[] args) {
		int ans = add(100, 10);
		System.out.println("100 + 10 = " + ans);
	}
	*/
	/*
	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		int[] array = makeArray(3);
		for(int i : array) {
			System.out.println(i);
		}
	}
	*/
	
	/*練習5-1
	public static void introduceOneself(String name, int age, double tall, char eto) {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
		System.out.println("身長：" + tall);
		System.out.println("干支：" + eto);
	}
	public static void main(String[] args) {
		System.out.println("自己紹介");
		introduceOneself("今井", 25, 173.5, '亥');
	}
	*/
	/*練習5-2・5-3
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	public static void main(String[] args) {
		//email("練習5-2について", "xxxxxxxx@xxxx.ne.jp", "上手く表示されていれば問題ないです。");
		String address = "xxxxxxx@xxxxx.ne.jp";
		String title = "練習5-2・5-3";
		String text = "テストメールです。返信不要です。";
		email(address, title, text);
		email(address, text);
	}
	
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + "\n" + text);
		
	}
	*/
	
	
	public static double calcTriangleArea(double bottom, double height) {
		System.out.println("三角形の底辺の長さは" + bottom + "cmcです。");
		System.out.println("三角形の高さは" + height + "cmです。");
		double TriangleArea = 0.5 * bottom * height;
		return TriangleArea;
		
	}
	
	public static double calcCircleArea(double radius) {
		System.out.println("円の半径は" + radius + "cmです。");
		double CircleArea = radius * radius * 3.14;
		return CircleArea;
		
	}
	
	public static void main(String[] args) {
		double bottom = 3;
		double height = 4;
		double radius = 5;
		double Triangle = calcTriangleArea(bottom, height);
		System.out.println("三角形の面積は" + Triangle + "㎠です。");
		
		double Circle = calcCircleArea(radius);
		System.out.println("円の面積は" + Circle + "㎠です。");
		
	}
	
}