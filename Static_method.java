package basicprograms;

public class Static_method {
	static void addition()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	static void multiplication()
	{
		int a=10;
		int b=20;
		System.out.println(a*b);
	}
   
	public static void main(String[] args) {
		addition(); //here "addition" method is defined before main method, if any method is defined before main method then after writing main method we need to call the method which is written before main method
		multiplication();

	}

}
