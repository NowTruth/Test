/* キーボードで入力した整数nが偶数か奇数かを判定し、その結果を表示してください。*/
import java.io.IOException;

public class Task02 {
	public static void main(String[] args) throws IOException {
		System.out.println("整数を入力してください");
		int n = new java.util.Scanner(System.in).nextInt();
		
		if(n%2 == 0) {
			System.out.println("偶数です");
		}
		if(n%2 == 1) {
			System.out.println("奇数です");
		}
		throw new IOException();
	}

}
