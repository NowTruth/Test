import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
整数を5つ入力してそれらを昇順に並べ替えて、
並び替えの結果と最大値、最小値を表示してください。
※arrays.sortは使用不可
 */

public class Task07Rev1 {
	public static void main(String[] args) throws IOException {
		//配列を用意
		int[] str = new int[5];
		System.out.println("5個の整数を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			//キーボードからの入力
			for (int i = 0; i < str.length; i++) {
				int s = i + 1;
				//キーボードから値を入力する。
				System.out.print(s + "個目の整数：");
				
				//int型への変換
				int n = Integer.parseInt(br.readLine());
				//入力した値を配列に代入する。
				str[i] = n;
			}

			//並び替え処理
			for (int j = 0; j < str.length; j++) {
				for (int k = str.length - 1; k > j; k--) {
					if (str[j] > str[k]) {
						int temp;
						temp = str[j];
						str[j] = str[k];
						str[k] = temp;
					}
				}
				
			}
			//並び替えた結果を表示
			for (int l : str) {
				System.out.println(l);
			}
			//最大値・最小値を表示
			System.out.println("最大値は" + str[0] + "で、" + "最小値は" + str[4] + "です。");

		}
		
		//整数以外が入力された場合の例外処理
		catch (NumberFormatException e) {
			System.out.println("NumberFormatException：\"数字以外が入力されました\"");
		}

	}

}
