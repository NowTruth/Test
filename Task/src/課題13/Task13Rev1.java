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

public class Task13Rev1 {

	public static void main(String[] args) throws IOException {
		//キーボード入力準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//変数の定義
		String kotoba1 = "";
		String kotoba2 = "";

		System.out.println("2つの同じ言葉を入力していください。");

		//文字を入力する無限ループ
		//1文字目と2文字目が同じ時はループを抜け出す
		while (kotoba1.equals("") || kotoba2.equals("") || !(kotoba1.equals(kotoba2))) {

			System.out.println("一つ目");
			//1文字目の入力
			kotoba1 = br.readLine();

			if (kotoba1.equals("")) {
			} else {
				System.out.println("二つ目");
				//2文字目の入力
				kotoba2 = br.readLine();

				if (kotoba2.equals("")) {
					//2つ目の文字列が空白なら1つ目の変数を初期化し、ループの始めから処理をする
					kotoba1 = "";
				}
				if (!(kotoba1.equals(kotoba2))) {
					//入力された2つの文字が違うなら始めから処理する
					System.out.println("違う言葉です。同じ言葉を入力してください。");
					//変数を初期化し、ループの始めから処理をする
					kotoba1 = "";
					kotoba2 = "";
				}
			}

		}

		//入力された2つの文字が同じなら終了する
		System.out.println("同じ言葉です。");
		System.out.println("終了");

	}

}
