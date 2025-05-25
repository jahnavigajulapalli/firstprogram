package basicprograms;

public class Try_catch_block {

	public static void main(String[] args) {
		try
		{
			int a=1/1;
			System.out.println("satisfied condition "  +a);
		}
		catch(ArithmeticException a1) {
			System.out.println("handled arithmetic exception");
		}
		

	}

}
