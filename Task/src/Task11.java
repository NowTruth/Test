import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
継承機能を使用して子クラスと、メインのメソッド用のクラスを作成し、
画像通りに表示してください。
 */

public class Task11 {

	public static void main(String[] args) throws IOException {

		System.out.println("整数を入力してください");

		//キーボードからの入力をする
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//入力された文字列型から整数型に変換
		System.out.print("1つ目の整数：");
		int m = Integer.parseInt(br.readLine());
		System.out.print("2つ目の整数：");
		int n = Integer.parseInt(br.readLine());

		//子クラス型のインスタンス
		CalculateChild result = new CalculateChild(m, n);

		//継承したメソッドを利用
		result.flow();

	}

}
