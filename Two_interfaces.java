package basicprograms;
interface two{
	void add(int r, double d);
	void sub(long l, float f);
}
interface one extends two{
	void mul(int s, int y);
	void div(float f, int k);
}
public class Two_interfaces implements one {

	public static void main(String[] args) {
		Two_interfaces s1=new Two_interfaces();
		s1.add(45, 78);
		s1.sub(2345l,54.6f);
		s1.mul(89, 78);
		s1.div(8, 78);
	}
	public void add(int r, double d) {
		System.out.println(r*d);
		
	}
	public void sub(long l, float f) {
		System.out.println(l+f);
	}
	public void mul(int s, int y) {
	System.out.println(s-y);
	}

	public void div(float f, int k) {
		System.out.println(f+k);
		
	}

}
