package basicprograms;
interface logic{
	void logic1();
	void logic2();
}

public class Interface_class implements logic {

	public static void main(String[] args) {
		Interface_class s1=new Interface_class();
		s1.logic1();
		s1.logic2();
		
		
    }
	public void logic1() {
		System.out.println("logic1");
	}

	public void logic2() {
		System.out.println("logic2");
	}

}
