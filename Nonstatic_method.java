package basicprograms;

public class Nonstatic_method {
	void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	void mul()
	{
		int a=10;
		int b=20;
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		//to call the non-ststic method we need to create the object
		//the syntax for creating the object is-->classname variable=new classname();
		//to call the nonstatic method-->variable.nonstatic method name();
		Nonstatic_method a1=new Nonstatic_method(); //here a1 is variable, a variable can be anything
		a1.add();//here add is nonstatic method name
		a1.mul();//by creating 1 object we can call all non static methods
		Nonstatic_method b1=new Nonstatic_method();
		b1.add();//we can call same nonstatic methods by creating 2 objects also
		b1.mul();
		
		

	}

}
