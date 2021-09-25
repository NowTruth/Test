package 課題10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 追加したコンストラクタを利用してインスタンスごとに名前が変えられるようにしてください。
 */

public class Task10Rev1 {
	public static void main(String[] args) throws IOException {

		//キーボードからの入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("ここでは名前を入力しません");

		//名無し用インスタンス生成
		Person name1 = new Person();

		//名無しを表示する
		name1.printName();

		System.out.println("名前を入力してください：");

		//入力名用インスタンス生成
		Person name2 = new Person(br.readLine());

		//入力名を表示する
		name2.printName();

	}

}
