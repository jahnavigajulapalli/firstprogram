package basicprograms;

public class Local_variables {
	static void add() {//local variables
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	void sub() {//local variables
		byte z=126;
		byte h=123;
		System.out.println(z-h);
		
	}
	static void add(int w,int y) {//local variable
		System.out.println(w*y);
	}
	void sub(long e,long u) {//local variable
		System.out.println(u%e);
	}

	public static void main(String[] args) {
		add();
		Local_variables s1=new Local_variables();
		s1.sub();
		add(1,2);
		s1.sub(6345l,456l);
	}

}
