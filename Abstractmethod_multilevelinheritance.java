package basicprograms;
abstract class mainparent{
	abstract void add(int e, int r);// here we have writen abstract method using multi-level inheritance
	
}
abstract class subparent extends mainparent{
	abstract void sub(long l, double d);
	
}
public class Abstractmethod_multilevelinheritance extends subparent {

	public static void main(String[] args) {
		Abstractmethod_multilevelinheritance s1=new Abstractmethod_multilevelinheritance();
		s1.add(12,34);
		s1.sub(45567l,23.456);
	}
		void sub(long l, double d) {
			System.out.println(l-d);
		
	}
	
	void add(int e, int r) {
		System.out.println(e+r);
		
		
	}

}
