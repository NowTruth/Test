
public class KyotoCleaningShop implements
	Cleaningservice{
		String ownerName;
		String address;
		String phone;
		
		//シャツを洗う
		public Shirt washShirt(Shirt s) {
			//大型洗濯 15分
			return s
		}
		
		//タオルを洗う
		public Towl washTowl(Towl t) {
			//大型洗濯機 10分
			return t;
		}
		
		//コートを洗う
		public Coat washCoat(Coat c) {
			//ドライ 20分
			return c;
		}
	}

