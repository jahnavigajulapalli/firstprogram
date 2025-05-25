package basicprograms;
abstract class parent4{
	abstract void add(int r, int y);//am
	abstract void sub(int u, int h);//am
	void mul(int a, int c)//cm
	{
		System.out.println("logic1"+" "+a+c);
	}
	void div(long a, double d) {
		System.out.println("logic2"+" "+a*d);
	}
}

public class Abstractandconcrete_methods extends parent4{

	public static void main(String[] args) {
		Abstractandconcrete_methods a1=new Abstractandconcrete_methods();
		a1.mul(12,56);
		a1.div(2345l, 6);
		a1.add(8, 9);
		a1.sub(78, 98);
		}
	void add(int r, int y) {
		System.out.println(r+y);
	}
	
	void sub(int u, int h) {
		System.out.println(u+h);
		
	}

}
