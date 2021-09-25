
public abstract class TangibleAsset extends Asset implements Thing{
	String color;
	double weight;
	
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}
	
	//メソッド
		public String getColor() {
			return this.color;
		}
		public void setweight(double weight) {
			this.weight = weight;
		}

}
