
public class ManagementStaff extends Staff {
	
	private String officialTitle;
	
	/**
	 * 管理職社員コンストラクタ
	 * @param name 氏名
	 * @param age 年齢
	 * @param officialTitle 役職
	 */
	ManagementStaff(String name, int age, String officialTitle) {
		super(name, age);
		this.officialTitle = officialTitle;
	}
	
	/**
	 * 役職取得メソッド
	 * @return String 役職
	 */
	public String getOfficialTitle() {
		return this.officialTitle;
	}
	
	/**
	 * 役職設定メソッド
	 * @param officialTitle 役職
	 */
	public void setOfficialTitle(String officialTitle) {
		this.officialTitle = officialTitle;
	}
	
	/**
	 * 社員情報詳細取得メソッド
	 * @return String 社員情報詳細取得
	 */
	public String getInformation() {
		return (super.getName() + "\t" + "\t" + super.getAge() + "歳" + "\t" + "\t" + this.getOfficialTitle());
	}

}
