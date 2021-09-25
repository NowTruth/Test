
import java.util.ArrayList;
import java.util.List;

import common.BusinessException;
import common.InputData;
import common.SystemMessage;
import common.SystemMessage.ID_MESSAGE;

/**
 * 社員管理クラス
 * @author ryo
 */
public class StaffManagement {

	//インスタンス生成
	private List<Staff> staffList = new ArrayList<Staff>();

	//インスタンス生成
	InputData input = new InputData();

	/**
	 * メニュー処理メソッド
	 * @throws BusinessException 業務例外
	 */
	public void logicMenu() throws BusinessException {

		while (true) {//社員追加の場合
			//メニュー番号の取得
			int menuno = input.inputInt(ID_MESSAGE.N0001, 0, 1);

			if (menuno == 1) { //終了の場合
				break;
			}

			//社員追加処理メソッドの呼び出し
			addStaff();
		}
		
	}

	/**
	 * 社員追加処理メソッド
	 * @throws BusinessException 業務例外
	 */
	private void addStaff() throws BusinessException {

		//追加社員種別番号の取得
		int addstaffno = input.inputInt(ID_MESSAGE.N0002, 0, 1);

		if (addstaffno == 0) {//一般職の場合
			//一般職社員追加処理の呼び出し
			addGeneralStaff();
		} else if (addstaffno == 1) {//管理職の場合
			addManagementStaff();
		}

		//社員情報一覧表示
		//タイトル行を表示する
		SystemMessage.outMessage(ID_MESSAGE.N0007);

		//社員情報表示
		for (Staff Staff : staffList) {
			System.out.println(Staff.getInformation());
		}

	}

	/**
	 * 一般職社員追加処理メソッド
	 * @throws BusinessException 業務例外
	 */
	private void addGeneralStaff() throws BusinessException {

		//氏名の取得
		String name = input.inputString(ID_MESSAGE.N0003, 10);
		//年齢の取得
		int age = input.inputInt(ID_MESSAGE.N0004, 0);
		//職種の取得
		String role = input.inputString(ID_MESSAGE.N0005, 5);

		//一般職社員追加
		GeneralStaff general = new GeneralStaff(name, age, role);

		//スタッフリストへの追加
		staffList.add(general);

	}

	/**
	 * 管理職社員追加処理メソッド
	 * @throws BusinessException 業務例外
	 */
	private void addManagementStaff() throws BusinessException {

		//氏名の取得
		String name = input.inputString(ID_MESSAGE.N0003, 10);
		//年齢の取得
		int age = input.inputInt(ID_MESSAGE.N0004, 0);
		//役職の取得
		String officialtitle = input.inputString(ID_MESSAGE.N0006, 5);

		//管理職社員追加
		ManagementStaff management = new ManagementStaff(name, age, officialtitle);

		//スタッフリストへの追加
		staffList.add(management);

	}

}
