package inheritance;
class grandparent{
	void add() {
		System.out.println("add");
	}
}
class parent extends grandparent{
	void sub() {
		System.out.println("sub");
	}
	
}


public class Multi_inheritance extends parent {// multi level inheritance maens having one child and parents,grandparents,ancesters etc;min 3 generations are required
	void mul() {
		System.out.println("mul");
	}
	public static void main(String[] args) {
		Multi_inheritance a1=new Multi_inheritance();
		a1.add();
		a1.sub();
		a1.mul();
		

	}

}
