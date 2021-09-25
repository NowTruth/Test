/*キーボードで整数nを入力し、
画像のように対角線の入った四角形(大きさは n × n)を表示してください。*/

public class Task03 {

	public static void main(String[] args) {
		//n×n行列におけるnの数を入力する
		System.out.println("数字を入力してください");
		int n = new java.util.Scanner(System.in).nextInt();
		
		//2次元配列を用意する
		String [][] matrix = new String[n][n];
		
		//i=jのときは*、i<>jのときは・を格納
		for(int i = 0 ; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j) {
					matrix[i][j] = "*";
				}else {
					matrix[i][j] = "・";
				}
			}
		}
		
		//表示する
		StringBuilder sb = new StringBuilder();
		for(int k = 0; k < n; k++) {
			for(int l = 0; l < n ; l++) {
				sb.append(matrix[k][l]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

}