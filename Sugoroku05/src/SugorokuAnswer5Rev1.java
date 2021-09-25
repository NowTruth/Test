//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
///*
//課題５
//ゴール到達後、もう一度最初から始めるかやめるかを選択出来るよう修正してください。
// */
//
///**
// * プレイヤークラス
// * @author ryo
// * @version 00.00.01
// */
//class Player {
//	//フィールド変数定義
//	public String name;
//	public int num;
//
//	/**
//	 * プレイヤーコンストラクタ
//	 * @param name　プレイヤー名
//	 */
//	Player(String name) {
//		//Player1, Player2…のようにプレイヤー名設定
//		this.name = "Player" + name;
//		//プレイヤーの進行マス数を初期化
//		this.num = 0;
//	}
//
//	/**
//	 * プレイヤー名設定メソッド
//	 * @param name　プレイヤー名
//	 */
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	/**
//	 * プレイヤー名取得メソッド
//	 * @return　String　プレイヤー名
//	 */
//	public String getName() {
//		return this.name;
//	}
//
//	/**
//	 * 進行マス数加算メソッド
//	 * @param num　進行マス数
//	 */
//	public void addNum(int num) {
//		//進行マス数を加算する
//		this.num += num;
//	}
//
//	/**
//	 * 進行マス数減算メソッド
//	 * @param num 進行マス数
//	 */
//	public void subNum(int num) {
//
//		if (this.num - num >= 0) {
//			//進行マス数を減算する
//			this.num -= num;
//		} else if (this.num - num < 0) {
//			this.num = 0;
//		}
//
//	}
//
//	/**
//	 * 合計進行マス数取得メソッド
//	 * @return int 合計進行マス数
//	 */
//	public int getNum() {
//		return this.num;
//	}
//}
//
///**
// * メインクラス
// * @author ryo
// */
///**
// * @author Owner
// *
// */
//public class SugorokuAnswer5Rev1 {
//
//	//List型playerListをインスタンス生成
//	List<Player> playerList = new ArrayList<Player>();
//
//	//すごろくマス数変数
//	int GOAL;
//
//	//サイコロの数
//	int dice;
//
//	//周回カウント
//	static int count = 1;
//
//	//再プレイの確認
//	int cont;
//
//	/**
//	 * メインメソッド
//	 * @param args　コマンドライン引数
//	 */
//	public static void main(String[] args) {
//
//		try {
//
//			System.out.printf("参加するプレイヤーの人数してください:");
//
//			//文字コードとして読み込む
//			InputStreamReader isr = new InputStreamReader(System.in);
//
//			//読み込んだ文字コードを文字列として読み込む
//			BufferedReader br = new BufferedReader(isr);
//
//			//キーボードから入力した文字列をinputに代入する
//			String input = br.readLine();
//
//			//キーボードから入力した文字列をint型に変換する
//			int playerNum = Integer.parseInt(input);
//
//			//SugorokuAnswer型sugoをインスタンス生成
//			SugorokuAnswer5Rev1 sugo = new SugorokuAnswer5Rev1();
//
//			for (int i = 0; i < playerNum; i++) {
//				//リストにプレイヤー名を追加する
//				sugo.playerList.add(new Player(String.valueOf(i + 1)));
//			}
//			System.out.printf("ゴールまでのマスの数:");
//
//			//すごろくのゴールのマス数をキーボードから入力する
//			input = br.readLine();
//			//キーボードから入力されたゴールのマス数をint型に変換する
//			sugo.GOAL = Integer.parseInt(input);
//
//			System.out.printf("振るサイコロの数を入力してください:");
//
//			//サイコロの数をキーボードから入力する
//			input = br.readLine();
//			//キーボードから入力されたサイコロの数をint型に変換する
//			sugo.dice = Integer.parseInt(input);
//
//			System.out.println("");
//
//			//終了判定
//			int isEnd = 0;
//
//			//isEnd = 1またはqが入力される、10ターン目までサイコロを振る
//			while (isEnd == 0 && !input.equals("q") && count <= 10) {
//
//				System.out.println(count + "ターン目です");
//				isEnd = sugo.sugoroku();
//
//				System.out.printf("終了する場合は q を入力してください:");
//				input = br.readLine();
//				System.out.println("");
//
//				count++;
//
//			}
//
//			//進んだマス数に応じて順位を入れ替える
//			for (int i = 0; i < sugo.playerList.size() - 1; i++) {
//				for (int j = 0; j < sugo.playerList.size() - 1; j++) {
//
//					//j+1のプレイヤーの方が多く進んでいれば、jのプレイヤーの進んだマス数を入れ替える
//					if (sugo.playerList.get(j).getNum() < sugo.playerList.get(j + 1).getNum()) {
//						//Playertempの定義
//						Player temp = new Player("temp");
//
//						//tempにjのプレイヤーを代入する
//						temp = sugo.playerList.get(j);
//						//jにj＋1のプレイヤーを代入する
//						sugo.playerList.set(j, sugo.playerList.get(j + 1));
//						//j+1にtempの値を代入する
//						sugo.playerList.set(j + 1, temp);
//					}
//				}
//			}
//			System.out.println("順位発表");
//			//順位を呼び出し、表示する
//			for (int i = 0; i < playerNum; i++) {
//				System.out.println((i + 1) + "位:" + sugo.playerList.get(i).getName() + ","
//						+ sugo.playerList.get(i).getNum() + "マス");
//			}
//
//			System.out.println("");
//
//			//すごろくを再プレイするかを聞く
//			System.out.println("再度プレイをする場合は、１を入力してください。");
//			System.out.println("終了する場合は、０を入力してください。");
//
//			//再プレイ確認をキーボードより入力する
//			input = br.readLine();
//			//キーボードから入力された再プレイ確認をint型に変換する
//			sugo.cont = Integer.parseInt(input);
//
//			if (sugo.cont == 1) {
//				sugo.playerList.clear();
//				count = 1;
//
//				String[] arguments = new String[] { "" };
//				SugorokuAnswer5Rev1.main(arguments);
//			} else {
//				//1で無かったら何もせずに終了する
//				System.out.println("終了します");
//			}
//
//		} catch (Exception e) {
//			System.out.println("例外：" + e);
//		}
//
//	}
//
//	/**
//	 * すごろくメソッド
//	 * @return int 終了判定結果
//	 */
//	public int sugoroku() {
//		int finish = 0;
//		int back = 0;
//
//		//進んだマス数がすごろくマス数（ゴール）以上なら終了する
//		for (int i = 0; i < playerList.size(); i++) {
//
//			//各プレイヤーの進んだマス数をリストに追加する
//			playerList.get(i).addNum(saikoro(dice));
//
//			//ゴールマスより進んだ場合
//			if (playerList.get(i).getNum() > GOAL) {
//				back = 2 * (playerList.get(i).getNum() - GOAL);
//				playerList.get(i).subNum(back);
//				System.out.println(playerList.get(i).getName() + " は " + playerList.get(i).getNum() + " まで戻りました ");
//			}
//			//ゴールマスに進んだ場合
//			else if (playerList.get(i).getNum() == GOAL) {
//				finish = 1;
//				System.out.println(playerList.get(i).getName() + " は " + playerList.get(i).getNum() + " まで進みました ");
//			} else { //ゴールマスに届かない場合
//				System.out.println(playerList.get(i).getName() + " は " + playerList.get(i).getNum() + " まで進みました ");
//			}
//
//		}
//
//		//進んだマス数がゴールマス以上なら戻る		}
//		return finish;
//	}
//
//	/**
//	 * サイコロメソッド
//	 * @return int 進むマス数
//	 * @param サイコロの数
//	 */
//	public int saikoro(int dice) {
//		//サイコロの目の合計
//		int sum = 0;
//
//		int temp;
//
//		Random random = new Random();
//
//		//サイコロの数の配列を用意する
//		int randomValue[] = new int[dice];
//
//		for (int i = 0; i < dice; i++) {
//
//			//1～6の乱数を返します
//			randomValue[i] = random.nextInt(6) + 1;
//			temp = randomValue[i];
//
//			sum = sum + temp;
//		}
//
//		System.out.println("サイコロの出た目の合計：" + sum);
//
//		return sum;
//	}
//}