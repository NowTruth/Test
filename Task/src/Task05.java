import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
キーボードで0～6を入力し、対応した曜日を表示してください。
例：0→日曜日～6→土曜日
switch文を使用してください。
 */

public class Task05 {
	public static void main(String[] args) throws IOException {
		//入力指示を表示
		System.out.println("0~6の数字を入力してください。");
		try {
			//キーボードからの入力情報を読み込む
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//入力された文字列型から整数型に変換する
			int yobi = Integer.parseInt(br.readLine());

			System.out.println("対応した曜日を表示します：" + yobi);

			//数値を曜日に変更する
			switch (yobi) {
				case 0:
					System.out.println("日曜日");
					break;
				case 1:
					System.out.println("月曜日");
					break;
				case 2:
					System.out.println("火曜日");
					break;
				case 3:
					System.out.println("水曜日");
					break;
				case 4:
					System.out.println("木曜日");
					break;
				case 5:
					System.out.println("金曜日");
					break;
				case 6:
					System.out.println("土曜日");
					break;
			}
			//0~6以外の数値が入力された際の処理
			if (yobi < 0 || yobi > 6) {
				System.out.println("0~6の範囲で数値を入力してください。");
			}
		}

		catch (NumberFormatException e) {
			//整数以外が入力された場合の例外処理
			System.out.println("NumberFormatException：\"数字以外が入力されました\"");
		}

	}

}
