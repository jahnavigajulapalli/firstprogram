package basicprograms;

public class Exception_handling {

	public static void main(String[] args) {
		try
		{
			int a=1/0;
			System.out.println("satisfied condition "  +a);
		}
		catch(ArithmeticException a1) {
			System.out.println("handled arithmetic exception");
		}
		

	}

}
