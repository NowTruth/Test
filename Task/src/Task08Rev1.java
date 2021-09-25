import java.io.BufferedReader;
import java.io.IOException; //IOExceptionクラスのインポート
import java.io.InputStreamReader;

/*
設問3と同様のキーボードから整数 n を入力し，
以下のような対角線の入った四角形(大きさは n × n)を書いてください。
※ただし main メソッド内は2行以内にしてください
※ヒント：同じクラス内に別メソッドを作成してください
 */

public class Task08Rev1 {

	public static void main(String[] args) throws IOException {
		//指示を画面に表示
		System.out.println("数字を入力してください");

		//行列にデータを格納し、内容を表示する。
		matrix();
	}

	//行列数を受け取り、データの格納、表示をさせる。
	public static void matrix() throws IOException {

		//キーボードからの入力をする
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//入力された文字列型から整数型に変換
		int n = Integer.parseInt(br.readLine());

		//i=jのときは*、i<>jのときは・を表示する
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print("*");//i=jのときは*を表示
				} else {
					System.out.print("・"); //i<>jのときは・を表示
				}
			}
			System.out.print("\n");//n列毎に改行する
		}

	}

}
