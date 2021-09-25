import java.io.BufferedReader;
import java.io.IOException; //IOExceptionクラスのインポート
import java.io.InputStreamReader;

/*
キーボードで整数を2つ入力し、入力した数字の積とそれを2で割った数を求めてください。
※入力値を引数とし計算結果を戻り値として返すメソッドとしてそれぞれ作成してください
 */

public class Task09Rev1 {

	public static void main(String[] args) throws IOException {
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

		//product関数に値を渡す
		int result1 = product(m, n);
		
		System.out.println("数字1と数字2の積は" + result1 + "です。");

		//quotient関数に値を渡す
		int result2 = quotient(result1);
		
		System.out.println("積を2で割った数は" + result2 + "です。");

	}

	//掛け算
	public static int product(int a, int b){
		int c = a * b;
		//戻り値
		return c;
	}

	//割り算
	public static int quotient(int a) {
		int d = a / 2;
		//戻り値
		return d;
	}

}
