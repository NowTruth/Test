package 課題13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
入力を2回行い、1回目と2回目の文字が同じかどうか表示してください。
1回目と2回目の文字が異なる場合はもう一度入力を促してください。
1回目の文字が空文字はもう一度入力を促してください。
2回目の文字が空文字はもう一度入力を促してください。
 */

public class Task13 {
	public static void main(String[] args) throws IOException {

		System.out.println("2つの同じ言葉を入力していください。");

		//入力判定メソッド呼び出し
		judgement();

	}

	//入力判定メソッド
	private static void judgement() throws IOException {
		//キーボード入力の準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//変数の定義
		String kotoba1 = "";
		String kotoba2 = "";

		//入力判断用の変数
		boolean judge1 = true;
		boolean judge2 = true;

		//1回目・2回目の入力文字が入力されるまでの処理
		while ((judge1 == true) || (judge2 == true)) {
			//1回目の入力
			System.out.println("一つ目");
			kotoba1 = br.readLine();

			if (!(kotoba1.equals(""))) {
				//Enter以外のものが入力されたらステータスをfalseにする
				judge1 = false;

				//2回目の入力
				System.out.println("二つ目");
				kotoba2 = br.readLine();

				if (!(kotoba2.equals(""))) {
					//1回目・2回目ともに文字が入力されたらループを抜ける
					judge2 = false;
					break;
				} else {
					//2回目の入力がEnterなら始めから処理をする
					judgement();
				}

			} else {
				//1回目の入力がEnterなら始めから処理をする
				judgement();
			}

		}
		//2つの入力文字が一致するまで入力を繰り返す
		//２つの入力文字の比較
		if (kotoba1.equals(kotoba2)) {
			System.out.println("同じ言葉です。");
			System.out.println("終了");
		} else {
			System.out.println("違う言葉です。同じ言葉を入力してください。");
			//2つの入力が異なるなら始めから処理をする
			judgement();
		}

	}

}
