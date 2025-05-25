package basicprograms;
public class Arthematic_operators 
{

	static int a=10;//global variable
	static int b=20;//global varaible
	
	static void add() {
	System.out.println(a+b);	
	}
static void sub() {
	System.out.println(a-b);	

	}
static void mul() {
	System.out.println(a*b);	

}
void mul(int a,int b) {
	System.out.println(a*b);	

}
	public static void main(String[] args) 
	{
	add();
	sub();
	mul();
	Arthematic_operators n=new Arthematic_operators();
	n.mul(10, 20);
	

	}

}
