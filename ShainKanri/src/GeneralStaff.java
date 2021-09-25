
/**
 * 一般職社員クラス
 * @author ryo
 */
public class GeneralStaff extends Staff {

	private String role;

	/**
	 * 一般職社員コンストラクタ
	 * @param name 氏名
	 * @param age 年齢
	 * @param role 職種
	 */
	GeneralStaff(String name, int age, String role) {
		super(name, age);
		this.role = role;
	}

	/**
	 * 職種取得メソッド
	 * @return String 職種
	 */
	public String getRole() {
		return this.role;
	}

	/**
	 * 職種設定メソッド
	 * @param role 職種
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * 社員情報詳細取得メソッド
	 * @return String 社員情報詳細
	 */
	public String getInformation() {
		return (super.getName() + "\t" + "\t" + super.getAge() + "歳" + "\t" + "\t" + this.role);
	}

}
