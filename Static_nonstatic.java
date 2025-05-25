package basicprograms;

public class Static_nonstatic {
	static void add(int a,int b) {
		System.out.println(a+b);
		
	}
    void add(long c,int d) {
    	System.out.println(c*d);
    	
    	
    }
	public static void main(String[] args) {
		add(1,2);
		Static_nonstatic n=new Static_nonstatic();
		n.add(1l,1);
	}

}
