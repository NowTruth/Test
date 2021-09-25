package 課題14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
設定したい数だけ値を入力して、これらの平均を表示してください。
例：平均を表示したい値を入力してください。
平均を表示したい値をすべて入力したら「OK」を入力してください。
 */

public class Task14Rev1 {
	public static void main(String[] args) throws IOException {

		//キーボード入力の準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//ArrayListを定義
		List<Integer> list = new ArrayList<>();

		//入力文字列を代入
		String str = "";

		//String型をint型に変換
		int num;
		//入力された値の合計
		int sum = 0;
		//入力された値の平均を求める
		int ave;

		System.out.println("平均を表示したい値を入力してください。");
		System.out.println("平均を表示したい値を全て入力したら、「OK」を入力してください");

		//OKが入力されるまでArraylistに値を入れる
		while (!(str.equals("OK"))) {
			System.out.println("数字か「OK」を入力してください");

			str = br.readLine();

			if (str.equals("OK")) {
				break;
			} else {
				//表示した文字をint型に変換する
				num = Integer.parseInt(str);

				//入力した文字をlistに追加する
				list.add(num);

			}

		}

		for (int number : list) {
			//OKが入力されたら、listに格納された文字を表示する
			System.out.println(number);

			//listに格納された値の合計を求める
			sum = sum + number;
		}

		try {
			//平均を求める
			ave = sum / list.size();
			System.out.println("入力した値の平均は：" + ave);
		}

		catch (ArithmeticException e) {
			System.out.println("平均を出力したい値を入力してください。");
			System.out.println(e);
		} catch (NumberFormatException f) {
			System.out.println("数値を入力してください。");
			System.out.println(f);
		}

	}

}
