package basicprograms;
abstract class parentclass2{
	abstract void add(int a, int b);//abstract method should always be present in abstract class
	abstract void sub(int c, long d);
	
}

public class Abstract_calssandmethod extends parentclass2{

	public static void main(String[] args) {
		 Abstract_calssandmethod a1=new  Abstract_calssandmethod();
		 a1.add(10,20);
		 a1.sub(13,17896l);
		
		}

	void add(int a, int b) {
		System.out.println(a+b);
	}

	
	void sub(int c, long d) {
		System.out.println(c+d);
	}

}
