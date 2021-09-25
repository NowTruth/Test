import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
設問9と同様にキーボードで整数を2つ入力し、
入力した数字の積とそれを2で割った数を求めてください。
 */

public class Task12{
	public static void main(String[] args) throws IOException{
		System.out.println("数字を2つ入力してください");
		System.out.println("入力した数字の積とそれを2で割った数を計算します。");
		System.out.println("数字1");
		//キーボードからの入力をする
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		//入力された文字列型から整数型に変換
		int m = Integer.parseInt(a.readLine());

		System.out.println("数字2");
		//入力された文字列型から整数型に変換
		int n = Integer.parseInt(a.readLine());
		
		//インスタンス生成
		Calc calc = new Calc(m, n);
		
	}

}
