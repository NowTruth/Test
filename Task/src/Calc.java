
public class Calc implements AreaCalc {

	public Calc(int a, int b) {
		//メソッド呼び出し
		int result = shikaku(a, b);
		int result2 = sankaku(result, 2);

		//結果の表示
		System.out.println("数字1と数字2の積は" + result + "です。");
		System.out.println("積を2で割った数は" + result2 + "です。");

	}

	//三角形の面積を求めるメソッドを定義
	public int sankaku(int a, int b) {
		int area = a / b;
		return area;
	}

	//四角形の面積を求めるメソッドを定義
	public int shikaku(int a, int b) {
		int area = a * b;
		return area;
	}

}
