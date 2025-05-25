package basicprograms;

import java.util.Arrays;

public class Copying_array_in_reverse_order {
public static void main(String[] args) {
		
		int [] inputA=new int[4];
		inputA[0]=53;
		inputA[1]=34;
		inputA[2]=23;
		inputA[3]=98;
		int [] inputB=new int[inputA.length];
		for (int i=0,j=inputA.length-1;i<inputA.length;i++,j--) {
			inputB[j]=inputA[i];
			
			
		}
		System.out.println("input of A"+Arrays.toString(inputA));
		System.out.println("input of B"+Arrays.toString(inputB));
	}


}
