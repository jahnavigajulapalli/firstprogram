package basicprograms;

import java.util.Scanner;

public class Array_values_at_run_time {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the size ");
		int []arrays=new int[s1.nextInt()];
		for (int i=0;i<arrays.length;i++) {
			System.out.println("the value at positions "+i);
			arrays[i]=s1.nextInt();
			
			
		}
		s1.close();

	}

}
