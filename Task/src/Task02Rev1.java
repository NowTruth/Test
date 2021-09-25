/* キーボードで入力した整数nが偶数か奇数かを判定し、その結果を表示してください。*/
import java.io.BufferedReader;									//BufferedReaderクラスのインポート
import java.io.IOException;										//IOExceptionクラスのインポート
import java.io.InputStreamReader;								//InputStreamReaderクラスのインポート

public class Task02Rev1 {										//Task02Rev1クラスの記述開始

	public static void main(String[] args) throws IOException {	//mainメソッドの記述開始
		System.out.println("整数を入力してください");				//指示を画面に表示させる
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
																//キーボードからの入力をする
		int n = Integer.parseInt(br.readLine());				//入力された文字列型から整数型に変換
		
		//偶数・奇数の条件分岐
		if(n%2 == 0) {											//偶数の条件判定
			System.out.println("偶数です");						//入力された数値が偶数のときの結果を表示
		}														//偶数の条件判定閉じ
		if(n%2 == 1) {											//奇数の条件判定
			System.out.println("奇数です");						//入力された数値が奇数のときの結果を表示
		}														//奇数の条件判定の閉じ
	}															//mainメソッドの閉じ

}																//クラスの閉じ
