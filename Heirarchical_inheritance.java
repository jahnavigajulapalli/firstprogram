package inheritance;
class parentclass{
	void add() {
		System.out.println("add");
	}
}
class child extends parentclass{
	void sub() {
		System.out.println("sub");
	}
}
public class Heirarchical_inheritance extends parentclass {
	static void mul() {
		System.out.println("mul");
	}

	public static void main(String[] args) {
		mul();
		Heirarchical_inheritance a1=new Heirarchical_inheritance();
		child b1=new child();
		a1.add();
		b1.sub();
		

	}

}
