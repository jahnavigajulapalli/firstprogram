package basicprograms;

import java.util.Arrays;

public class Two_arrays_Are_equal {

	public static void main(String[] args) {
		int []a=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		int []a1=new int[3];
		a1[0]=1;
		a1[1]=4;
		a1[2]=3;
		boolean b=Arrays.equals(a1, a);
		if(b==true) {
			System.out.println("two arrays are equal");
		}
		else {
			System.out.println("two arrays are not equal");
		}
		String []q=new String[1];
		q[0]="jahnavi";
		String []q1=new String[1];
		q1[0]="jahnavi";
		boolean b1=Arrays.equals(q, q1);
		if(b1==true) {
			System.out.println("two arrays are same");
		}
		else {
			System.out.println("two arrays are not same");
		}
			
		}
		
	}


