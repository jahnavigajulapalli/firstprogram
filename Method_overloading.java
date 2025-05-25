package basicprograms;

public class Method_overloading {
	static void add()//method overloading means having multiple methods with same name but with diff parameters
	//method overloading can be combination of both static and non-static methods
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	static void add(int c,int d) {
		System.out.println(c*d);
	}
	void sub() {
		int i=20;
		int h=10;
		System.out.println(i-h);
	}
	void sub(int r,int e) {
		System.out.println(r-e);
	}

	public static void main(String[] args) {
		add();//calling static methods
		add(10,30);
		Method_overloading a1=new Method_overloading();//creating object for non-static methods
		a1.sub();//calling by using reference variable
		a1.sub(30,10);
		
		

	}

}
