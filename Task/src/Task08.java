import java.io.BufferedReader;
import java.io.IOException; //IOExceptionクラスのインポート
import java.io.InputStreamReader;

/*
設問3と同様のキーボードから整数 n を入力し，
以下のような対角線の入った四角形(大きさは n × n)を書いてください。
※ただし main メソッド内は2行以内にしてください
※ヒント：同じクラス内に別メソッドを作成してください
 */

public class Task08 {

	public static void main(String[] args) throws IOException {
		//行列数を得る
		int n = number();
		//行列にデータを格納し、内容を表示する。
		method(n);
	}

	//行列数の値の入力し、int型として値を返す関数
	public static int number() throws IOException {
		//指示を画面に表示
		System.out.println("数字を入力してください");
		//キーボードからの入力をする
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//入力された文字列型から整数型に変換
		int n = Integer.parseInt(br.readLine());

		//行列数を返す
		return n;
	}

	//行列数を受け取り、データの格納、表示をさせる。
	public static void method(int n) {

		//1次元配列を用意する
		String[] matrix = new String[n * n]; //matrix行列のインスタンス生成

		//i=jのときは*、i<>jのときは・を格納
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) { //条件判断
					matrix[(i * n) + j] = "*";
				} else {
					matrix[(i * n) + j] = "・"; //i<>jのときは・を格納
				}
			}
		}

		//表示処理
		for (int k = 0; k < n; k++) {
			for (int l = 0; l < n; l++) {
				System.out.print(matrix[k * n + l]); //配列の中身を表示
			}
			System.out.print('\n'); //改行コードを入力
		}
	}

}
