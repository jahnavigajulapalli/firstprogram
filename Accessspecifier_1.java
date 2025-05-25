package basicprograms;

public class Accessspecifier_1 extends Accessspecifier_program{

	public static void main(String[] args) {
		add(9,56);
		Accessspecifier_program w=new Accessspecifier_program();
		w.mul(45, 34);
		//w.sub(89,65); //within the same package but with diff class privite access specifier is not allowed
		div(34,78);

	}

}
