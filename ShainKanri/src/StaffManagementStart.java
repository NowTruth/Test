import common.BusinessException;

/**
 * 社員管理機能実行クラス
 * @author ryo
 */
public class StaffManagementStart {

	public static void main(String[] args){

		try {
			//インスタンス生成
			StaffManagement staff = new StaffManagement();

			//メニュー処理メソッドの呼び出し
			staff.logicMenu();

		}catch(BusinessException b) { //例外処理
			//エラーメッセージ表示
			System.out.println(b.getStProc());
			//スタックトレース表示
			b.printStackTrace();
		}
	}
}
