import java.io.IOException;


public class Main {
	public static void main(String[] args) throws IOException{
		System.out.println("プログラムが起動しました");
		throw new IOException();
		
		/*
		try {
		String str = "3";
		int num = Integer.parseInt(str);
		System.out.println("String型：" + str + '\n' + "int型：" + num);
		
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatEcveption例外エラーをcatchしました");
		}
		*/
		
		/*
		try {
			String s = null;
			System.out.println(s.length());
		}catch(NullPointerException e){
			System.out.println("NullPoinnterException例外をcatchしました");
			System.out.println("--スタックトレース（ここから）--");
			e.printStackTrace();
			System.out.println("-- スタックトレース（ここまで）--");
		}
		*/
		
	}
}
