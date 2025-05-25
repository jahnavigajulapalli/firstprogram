package basicprograms;
class parent1{
	void cons1() {
		System.out.println("constructor1");//constructors can not be inherited it is called by using super statement.
	}
}
class parent2 extends parent1{
	void cons2(int a, int b) {
		System.out.println("constructor2" +a+b);
	}
}
public class Super_calling_statement extends parent2{
	Super_calling_statement (int s,int r){
		super();
		System.out.println("constructor3" +s+r);
	}
	public static void main(String[] args) {
		
		
		Super_calling_statement s1=new Super_calling_statement(2,8);
		s1.cons1();
		s1.cons2(3, 4);
		

	}

}
