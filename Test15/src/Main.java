import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		Date future = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(f.format(future));
		
		
		
		
		
		
		/*
		public final String concatPath(final String folder, final String file) {
			if(!folder.endsWith("¥¥")) {
				folder += "¥¥";
			}
			return folder + file;
		}
		
		String s = new concatPath("c:¥java¥text¥","readmemo.txt");	
		System.out.println(s);
		*/
		
		/*
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 100; i++) {
			sb.append(i+1).append(",");
		}
		
		String s = sb.toString();
		String[] a = s.split(",");
		
		System.out.println(s);
		
		for(int j = 0; j < 100; j++) {
			System.out.println(a[j]);
		}
		
		String folder_path = "c:¥Javadev¥";
		String file_name = "readme.txt";
		
		StringBuilder s1 = new StringBuilder();
		s1.append(folder_path).append(file_name);
		
		String s2 = s1.toString();
		System.out.println(s2);
		*/
		
		/*
		//Instantの生成
		Instant i1 = Instant.now(); //現在日時を取得
		//Instantとlong値との相互変換
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long l = i2.toEpochMilli();
		
		System.out.println(l);
		System.out.println(i2);
		
		//ZonedDateTimeの生成
		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(2020,1,2,3,4,5,6,ZoneId.of("Asia/Tokyo"));
		
		//InstantとZonedDateTimeの相互変換
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
		
		//ZonedDateTimeの利用方法
		System.out.println("東京：" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("ロンドン：" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
		
		if(z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間を指しています");
		}
		
		
		//LocalDateTimeの生成方法
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2020,1,1,9,5,0,0);
		
		//LocalDateTimeとZonedDateTimeの相互変換
		ZonedDateTime z4 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z4.toLocalDateTime();
		
		System.out.println(z4);
		System.out.println(l3);
		
		
		//文字列からLocaDateを生成
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate = LocalDate.parse("2020/09/22", fmt);
		
		//1000日後を計算する
		LocalDate ldatep = ldate.plusDays(1000);
		String str = ldatep.format(fmt);
		System.out.println("現在は" + ldate);
		System.out.println("1000日後は" + str);
		
		//現在日付との比較
		LocalDate now = LocalDate.now();
		if(now.isAfter(ldatep)) {
			System.out.println("1000日後は過去日付です");
		}
		
	
		
		Calendar c = Calendar.getInstance();
		//6つのint値からDateインスタンスを生成
		c.set(2019,8,22,1,23,45);
		c.set(Calendar.MONTH, 9);
		Date d = c.getTime();
		System.out.println(d);
		
		//Dateインスタンスからint値を生成
		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//文字列からDateインスタンスを生成
		Date g = f.parse("2020/09/22 01:23:45");
		System.out.println(g);
		
		//Dateインスタンスから文字列を生成
		String s = f.format(now);
		System.out.println("現在は" + s + "です");
		
		
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		String s4 = "";
		
		if(s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを大小区別しなければ等しい");
		}
		
		System.out.println("s1の長さは" + s1.length() + "です");
		
		if(s4.isEmpty()) {
			System.out.println("s4は空文字です。");
		}
		
		String s5 = "Java and JavaScript";
		if(s5.contains("Java")) {
			System.out.println("文字列s5は、Javaを含んでいます");
		}
		if(s5.endsWith("Java")) {
			System.out.println("文字列s5は、Javaが末尾にあります");
		}
		System.out.println("文字列s5で最初にJavaが登場する位置は" + s5.indexOf("Java"));
		System.out.println("文字列s5で最後にJavaが登場する位置は" + s5.lastIndexOf("Java"));
		
		*/
	}
}
