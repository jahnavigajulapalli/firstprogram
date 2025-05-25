package basicprograms;

public class Constructors_overloading {
	Constructors_overloading()//constructor overloading means multiple constructors with same name but with different parameters
	{
		System.out.println("overloading1");
	}
	Constructors_overloading(int a,int b){
		System.out.println(a+b);
		
	}
	Constructors_overloading(float c,double d){
		System.out.println(c*d);
	}
	Constructors_overloading(char f,String name){
		System.out.println(f+" " +name);//here if we give space between char and string then we can add just a empty space in print statement
	}
	public static void main(String[] args) {
		new Constructors_overloading();
		new Constructors_overloading(10,5);
		new Constructors_overloading(1,2.34);
		new Constructors_overloading('a',"janu");
		
		
	}

}
