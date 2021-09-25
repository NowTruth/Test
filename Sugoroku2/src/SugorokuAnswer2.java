import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
課題２
サイコロの目がランダムに表示されるよう修正してください。
 */

/**
 * @author ryo
 * @version 00.00.01
 */

/**
 * Playerクラス
 */
class Player {
	//変数定義
	public String name;
	public int num;

	/**
	 * Playerコンストラクタ
	 * プレイヤー名用メソッド
	 * @param name　双六プレイヤー名
	 */

	//Playerコンストラクタ定義
	Player(String name) {
		this.name = "Player" + name;
		this.num = 0;
	}

	//プレイヤー名を変更するメソッド
	public void setName(String name) {
		this.name = name;
	}

	//Player名を呼び出すメソッド
	public String getName() {
		return this.name;
	}

	/**
	 * マス目用メソッド
	 * @param num　進んだマス目
	 */

	//進んだマス名を書き換えるメソッド
	public void addNum(int num) {
		this.num += num;
	}

	//進んだマス目を呼び出すメソッド
	public int getNum() {
		return this.num;
	}
}

/**
 * メインクラス
 */
public class SugorokuAnswer2 {

	//List型インスタンス生成
	List<Player> playerList = new ArrayList<Player>();
	//変数定義
	int GOAL;
	//乱数用の変数定義
	int count;

	/**
	 * メインメソッド
	 * @param args　
	 */

	//mainメソッド
	public static void main(String[] args) {
		try {
			System.out.printf("参加するプレイヤーの人数してください:");
			//バイトコードを文字列に変換する
			InputStreamReader isr = new InputStreamReader(System.in);

			//入力された文字を読み取る
			BufferedReader br = new BufferedReader(isr);

			//キーボードから入力した文字列を変数に格納する
			String input = br.readLine();

			//キーボードから入力した文字列をint型に変換
			int playerNum = Integer.parseInt(input);

			//コンストラクタの定義
			SugorokuAnswer2 sugo = new SugorokuAnswer2();

			//参加人数の数だけPlayer1、Player2...の順にリストに追加していく
			for (int i = 0; i < playerNum; i++) {
				sugo.playerList.add(new Player(String.valueOf(i + 1)));
			}

			System.out.printf("ゴールまでのマスの数:");

			//ゴールまでのマス数をキーボードから入力する
			input = br.readLine();

			//入力された値をint型に変換する
			sugo.GOAL = Integer.parseInt(input);
			System.out.println("");

			int isEnd = 0;

			//ゴールするかquitするまでマスを進む
			while (isEnd == 0 && !input.equals("q")) {

				isEnd = sugo.sugoroku();
				System.out.printf("終了する場合は q を入力してください:");
				input = br.readLine();
				System.out.println("");
			}

			//進んだマス目が多い順にPlayerを並び替える
			for (int i = 0; i < sugo.playerList.size() - 1; i++) {
				for (int j = 0; j < sugo.playerList.size() - 1; j++) {
					if (sugo.playerList.get(j).getNum() < sugo.playerList.get(j + 1).getNum()) {

						//Playertempをインスタンス生成する
						Player temp = new Player("temp");
						//リストに登録するjとj+1のplayer名を入れ替える
						temp = sugo.playerList.get(j);
						sugo.playerList.set(j, sugo.playerList.get(j + 1));
						sugo.playerList.set(j + 1, temp);
					}
				}
			}
			//順位表示
			System.out.println("順位発表");
			for (int i = 0; i < playerNum; i++) {
				System.out.println((i + 1) + "位:" + sugo.playerList.get(i).getName() + ","
						+ sugo.playerList.get(i).getNum() + "マス");
			}
		} catch (Exception e) {
			System.out.println("例外：" + e);
		}
	}

	/**
	 * サイコロを振り、双六をするメソッド
	 * sugorokuメソッド
	 * @return finish　ゴールの判定
	 */

	public int sugoroku() {
		int finish = 0;

		for (int i = 0; i < playerList.size(); i++) {

			//saikoroメソッドで返された値を進んだマス目としてPlayerごとに追加していく
			playerList.get(i).addNum(saikoro());

			System.out.println(playerList.get(i).getName() + " は " + playerList.get(i).getNum() + " まで進みました ");

			//進んだマス目がゴールまでのマス目以上ならループを抜ける
			if (playerList.get(i).getNum() >= GOAL) {
				finish = 1;
			}
		}
		//呼び出し素に1を返し、ループを抜け出させる
		return finish;
	}

	/**
	 * 進むマス数を決めるメソッド
	 * @return (count % 6) 進むマス数
	 */

	public int saikoro() {

		//乱数インスタンス生成
		Random rand = new Random();
		//1~6の乱数を発生させる
		count = rand.nextInt(5) + 1;

		//1~6の乱数を返す
		return (count);
	}
}