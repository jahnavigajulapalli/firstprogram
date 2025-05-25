package basicprograms;

public class Accessspecifier_program {//inside the class all access specifiers are allowed and method can be anything
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	protected void mul(int y, int g) {
		System.out.println(y*g);
	}
	static void div(int u, int i) {
		System.out.println(u/i);
	}
	
	private void sub(int c, int d) {
		System.out.println(c-d);
		}
	

	public static void main(String[] args) {
		add(9,56);
		Accessspecifier_program w=new Accessspecifier_program();
		w.mul(45, 34);
		w.sub(89,65);
		div(34,78);
		

	}

}
