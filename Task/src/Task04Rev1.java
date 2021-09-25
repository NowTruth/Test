import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task04Rev1 {
	public static void main(String[] args) throws IOException {
		//入力指示を表示
		System.out.println("数字を入力してください。\n「100」を入力した数字で徐算します。");
		
		//徐算処理
		try {
			//キーボードからの入力情報を読み込む
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//入力された文字列型から整数型に変換する
			int n = Integer.parseInt(br.readLine());
			//100÷nを計算する
			int result = 100/n;
			//計算結果を表示する
			System.out.println(result);
		}
		
		//整数以外が入力された場合の例外処理
		catch (NumberFormatException e) {
			 	System.out.println("NumberFormatException：\"数字以外が入力されました\"");
		 	}
		//0が入力された場合の例外処理
		 catch (ArithmeticException e){
			System.out.println("ArithmeticException：\"0で徐算できません\"");
		}
		
		//徐算処理・演算処理が完了した後の処理
		finally {
			System.out.println("終了");
		}
	}

}
