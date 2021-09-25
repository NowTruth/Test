
public class Account {
	String accountNumber;	//口座番号
	int balance;			//残高
	
	public String toString() {
		return "¥¥" + this.balance + "(口座番号：" + this.accountNumber + ")";
	}
	
	public boolean equals(Object o) {
		if(this == o) {
			System.out.println("同一インスタンスです");
			return true;
		}
		if(o instanceof Account) {
			Account a = (Account)o;
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			if(an1.equals(an2)) {
				System.out.println("同一インスタンスです");
				return true;
			}
		}
		System.out.println("異なるインスタンスです");
		return false;
	}

}
