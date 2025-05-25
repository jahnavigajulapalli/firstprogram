package basicprograms;
class parent{
	void add(int a, int b) {
		System.out.println(a*b);
	}
}

public class Method_overriding extends parent {
	void add(int a, int b) { //the o/p will be the a+b, here the second method is suppressing the first method to overcome this we can use super keyword
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		Method_overriding a1=new Method_overriding();
		a1.add(12, 34);

	}

}
