package basicprograms;
class parents{
	void add(long a, int b) {
		
		System.out.println(a*b);
	}
}

public class Super_keyword extends parents {
	void add(int a, int b) { //the o/p will be the a+b, here the second method is suppressing the first method to overcome this we can use super keyword
		super.add(122333l, 13);
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		
		Super_keyword a1=new Super_keyword();
		a1.add(12, 34);

	}

}
