package basicprograms;

public class Constructors {
	Constructors() //constructors are 2 types parameterized and non- parameterized
	{
		System.out.println("this is non-parametrized constructor");
	}
	Constructors(int a,int b)// this is parameterized constructor
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		//Constructors a1=new Constructors();// for running constructors we don't want to call by reference variable creating object is enough to run the constructor program
		//there are 2 ways for creating object
		//1. classname variable=new classname();//this way is use for non-static methods
		//2. new classname();// this way is used for constructors
		new Constructors();
		new Constructors(10,20);
		
	}

}
