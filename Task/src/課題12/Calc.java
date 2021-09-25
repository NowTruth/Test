package 課題12;

public class Calc implements AreaCalc {

	//三角形の面積を求めるメソッドを定義
	public int sankaku(int a, int b) {
		int area = a * b / 2;
		return area;
	}

	//四角形の面積を求めるメソッドを定義
	public int shikaku(int a, int b) {
		int area = a * b;
		return area;
	}

}
