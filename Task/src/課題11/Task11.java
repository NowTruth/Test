package 課題11;

import java.io.IOException;

/*
継承機能を使用して子クラスと、メインのメソッド用のクラスを作成し、
画像通りに表示してください。
 */

public class Task11 {

	public static void main(String[] args) throws IOException {

		//CalculateSuperクラスのインスタ生成
		CalculateSuper result = new CalculateSuper(5, 3);

		//1回目の計算
		result.flow();

		//子クラス型のインスタンス定義
		CalculateChild result2 = new CalculateChild(10, 7);

		//1回目の計算結果を利用した2回目の計算
		result2.flow();

	}

}
