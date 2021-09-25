package 課題11;

/*
 スーパークラスで定義されたメソッドがサブクラスにそのまま引き継がれるのに対して、
 コンストラクターはそのままでは引き継がれない。
 */

public class CalculateChild extends CalculateSuper {
	//コンストラクタの定義
	protected CalculateChild(int param1, int param2) {
		super(param1, param2);

	}

	protected void flow() {

		super.sub();
		super.sum();

	}

}
