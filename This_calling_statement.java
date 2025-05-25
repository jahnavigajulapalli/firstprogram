package basicprograms;

public class This_calling_statement {// this calling statement is used to call all constructors by creating one object
	This_calling_statement(){
		System.out.println("non-parameterized constructor");
		
	}
	This_calling_statement(int a, int b){
		this (12345l,23);
		System.out.println(a+b);
		
	}
	This_calling_statement(long a, int b){
		this();
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		new This_calling_statement(5,10);
		
		

	}

}
