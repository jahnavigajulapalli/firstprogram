package basicprograms;

import java.util.Arrays;

public class Copying_array {

	public static void main(String[] args) {
		
		int [] inputA=new int[4];
		inputA[0]=23;
		inputA[1]=34;
		inputA[2]=23;
		inputA[3]=98;
		int [] inputB=new int[4];
		for (int i=0;i<inputA.length;i++) {
			inputB[i]=inputA[i];
			
			
		}
		System.out.println("input of A"+Arrays.toString(inputA));
		System.out.println("input of B"+Arrays.toString(inputB));
	}

}
