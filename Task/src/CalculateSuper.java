
public class CalculateSuper {
	 protected int param1;
     protected int param2;

     protected CalculateSuper(int param1, int param2) {
         this.param1 = param1;
         this.param2 = param2;
     }

     protected void flow(){
         sum();
         sub();
     }

     protected void sum() {
         System.out.println(param1 + "と" + param2 + "足すと" + (param1 + param2));
     }

     protected void sub() {
         System.out.println(param1 + "と" + param2 + "引くと" + (param1 - param2));
     }
}
