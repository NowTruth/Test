/*
キーボードで整数nを入力し、100/nの結果を表示してください。
その後、"終了"を表示してください。
※下記exceptionをcatchした時エラー文を表示してください。
ArithmeticException："0で除算できません"
NumberFormatException："数字以外が入力されました。"
*/

public class Task04 {

	public static void main(String[] args) {
		System.out.println("数字を入力してください。\n「100」を入力した数字で徐算します。");
		try {		
			String str = new java.util.Scanner(System.in).nextLine();
			int n = Integer.parseInt(str);
			int result = 100/n;
			System.out.println(result);
		}catch (NumberFormatException e) {
			 	System.out.println("NumberFormatException：\"数字以外が入力されました\"");
		 	}
		 catch (ArithmeticException e){
			System.out.println("ArithmeticException：\"0で徐算できません\"");
		}
		finally {
			System.out.println("終了");
		}
	}
}
