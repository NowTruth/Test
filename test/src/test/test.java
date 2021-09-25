package test;

public class test {

	public static void main(String[] args) {
		/*演習2-3
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		
		int fortune = new java.util.Random().nextInt(3);
		fortune = fortune++;
		//fortune = new java.util.Random().nextInt(fortune);
		//乱数が0から4の間で作成されてしまう。
		
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は"
				+ fortune + "です");
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");
		*/
		
		/*
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5)+1;
		switch (fortune) {
		case 1:
		case 2:
		System.out.println("いいね！");
		break;
		case 3:
		System.out.println("普通です");
		break;
		case 4:
		case 5:
			System.out.println("う〜ん…");
			break;
		}
		*/
		
		/*
		 weight == 60
		 2*(age1 + age2) > 60
		 age % 1
		 name.equals("湊")
		 */
		
		/*
		int isHungry = 1;
		String food = "ごはん";
		System.out.println("こんにちは");
		if(isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		}
		else {
			System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
			System.out.print(ln("ごちそうさまでした");
		}
		*/
		
		/*
		System.out.println("[メニュー]1:検索 2:登録 3:削除 4:変更>");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch(selected) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
		}
		*/
		
		System.out.println("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(9);
		for(int i = 0 ; i < 5 ; i++)
		{
			System.out.println("0~9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if(num == ans)
			{
				System.out.println("アタリ");
				break;
			}else
				System.out.println("ハズレ");
		}
		
		System.out.println("ゲームを終了します");
	}
}
