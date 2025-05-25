package inheritance;

import basicprograms.Accessspecifier_program;//outside the package but creating realtionship with sub class, only public and protected access specifiers can be accessed 

public class Accessspecifier_3 extends Accessspecifier_program {

	public static void main(String[] args) {
		Accessspecifier_program.add(9,56);
		Accessspecifier_3 a=new Accessspecifier_3();
		a.mul(23, 45);
		
		
		
		
		

	}

}
