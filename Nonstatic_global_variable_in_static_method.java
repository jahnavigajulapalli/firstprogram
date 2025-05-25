package basicprograms;


public class Nonstatic_global_variable_in_static_method {
	
		 int a=10;//global variable
		int b=20;//global varaible
		
		static void add() {
			Local_variable c1=new Local_variable();
		System.out.println(c1.a+c1.b);	
		}
	static void sub() {
		Local_variable c1=new Local_variable();

		System.out.println(c1.a-c1.b);	

		}

		public static void main(String[] args) {
			add();
			sub();

		}

	}


