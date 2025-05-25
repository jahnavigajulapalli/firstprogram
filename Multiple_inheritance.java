package inheritance;
interface parent1{//multiple inheritance is not possible usimg class because of diamond problem but it is possible using interface
	static void add(){//multiple-inheritance means 2or more than 2 parent class and 1 child class
		System.out.println("add");
		
	}
}
interface parent2{
	static void add() {
		System.out.println("add");
	}
}

public class Multiple_inheritance implements parent1,parent2 {
	static void add() {
		System.out.println("add");
	}

	public static void main(String[] args) {
	add();
	add();
	add();

	}

}
