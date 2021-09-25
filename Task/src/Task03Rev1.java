import java.io.BufferedReader;									//BufferedReaderクラスのインポート
import java.io.IOException;										//IOExceptionクラスのインポート
import java.io.InputStreamReader;								//InputStreamReaderクラスのインポート

public class Task03Rev1 {										//Task03Rev1クラス記述開始

	public static void main(String[] args) throws IOException{	//メインメソッド記述開始
		//n×n行列におけるnの数を入力する
		System.out.println("数字を入力してください");	//指示を画面に表示
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
															//キーボードからの入力をする
		int n = Integer.parseInt(br.readLine());			//入力された文字列型から整数型に変換

		//1次元配列を用意する
		String [] matrix = new String[n * n];		//matrix行列のインスタンス生成
		
		//i=jのときは*、i<>jのときは・を格納
		for(int i = 0 ; i < n; i++) {				//iの繰り返し条件
			for(int j = 0; j < n; j++) {			//jの繰り返し条件
				if(i == j) {						//条件判断
					matrix[(i*n) + j] = "*";		//i=jのときは*を格納
				}else {								//条件判断2
					matrix[(i*n) + j] = "・";		//i<>jのときは・を格納
				}									//条件判断2の閉じ
			}										//jの繰り返し条件の閉じ
		}											//iの繰り返し条件の閉じ
		
		//表示処理
		for(int k = 0; k < n; k++) {				//kの繰り返し条件
			for(int l = 0; l < n; l++) {			//lの繰り返し条件
				System.out.print(matrix[k*n + l]);	//matrix行列の中身を表示
			}										//lの繰り返し条件閉じ
				System.out.print('\n');				//改行コードを入力
		}											//kの繰り返し条件の閉じ
	}												//mainメソッドの閉じ

}													//クラスの閉じ
