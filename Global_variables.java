package basicprograms;

public class Global_variables {
	int a=12;
	int b=23;
	static int y=23;
	static int d=45;
	static void add() {//calling non-static variables in static method
		Global_variables g=new Global_variables();
		System.out.println(g.a+g.b);
	}
	static void mul() {//calling static variables in static method
		System.out.println(y*d);
	}
	void sub() {//calling non-static variables in non-static method
		System.out.println(a-b);
	}
	void div() {
		System.out.println(y/d);//calling static variables in non-static method
	}
	public static void main(String[] args) {
		add();
		mul();
		Global_variables g1=new Global_variables();
		g1.sub();
		g1.div();
		

	}

}
