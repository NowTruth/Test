import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 文字列を5つ入力し、それらを配列に入れてから再度並べて表示してください。
 */

public class Task06 {
	public static void main(String[] args) throws IOException {
		//配列を用意する。
		String[] str = new String[5];
		
		//入力処理
		for(int i = 0; i < 5; i++) {
			int s = i + 1;
			//キーボードから値を入力する。
			System.out.print("文字を入力してください" + s +  "個目：");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//入力した値を配列に代入する。
			str[i] = br.readLine();
		}
		
		//表示処理
		System.out.print("入力された文字は");
		for(int i = 0; i < 5; i++) {
			System.out.print(str[i]);
		}
	
	
	}

}
