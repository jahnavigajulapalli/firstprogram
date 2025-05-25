package basicprograms;
class parentclass{
	/*
	 * void add(int a, int b) { System.out.println(a+b); }
	 */
	static void add() {
	
}
}
public class Single_inheitence extends parentclass {//single inheritance means one parent and one child
	/*
	 * void sub(int c, int d ) { System.out.println(c-d); }
	 */
	static void sub() {
		
	}
	public static void main(String[] args) {
		//Single_inheitence a1=new Single_inheitence();
		sub();
		add();
	}

}
