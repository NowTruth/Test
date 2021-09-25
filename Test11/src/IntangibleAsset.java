
public abstract class IntangibleAsset extends Asset{
	String color;
	
	public IntangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}
	
	//メソッド
		public String getColor() {
			return this.color;
		}
}
