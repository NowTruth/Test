
public class Person {
	private String name;

    public Person() {
        this.name = "名無し";
    }
    
    public Person(String n) {
        this.name = n;
    }
    
    public void printName(){
        System.out.println("私の名前は " + this.name + " です");
    }
}
