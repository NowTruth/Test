
/**
 * スタッフクラス
 * @author ryo
 */
public class Staff {

	//フィールド変数の定義
	private String name;
	private int age;

	/**
	 * スタッフコンストラクタ
	 * @param name 指名 age 年齢
	 */
	Staff(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * 氏名取得メソッド
	 * @return String 氏名
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 氏名設定メソッド
	 * @param name 氏名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 年齢取得メソッド
	 * @return int 年齢
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * 年齢設定メソッド
	 * @param age 年齢
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 社員情報詳細取得メソッド
	 * @return String 社員情報詳細
	 */
	public String getInformation() {
		return (getName() + "\t" + "\t" + getAge() + "歳");
	}

}
