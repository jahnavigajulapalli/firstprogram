package basicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array_basics {

	public static void main(String[] args) {
		//syntax for array: datatype []variable=new datatype[size];
		Scanner s1=new Scanner(System.in);//to take i/p from user
		int []a1=new int[5];//declaration
		a1[0]=21;
		a1[1]=22;
		a1[2]=23;
		a1[3]=34;
		a1[4]=45;
		for (int i=0;i<=4;i++) {
			System.out.println("enter the value"+i);
			a1[i]=s1.nextInt();
			//System.out.println(a1[i]);//prints given numbers in vertical order
		
		}
 System.out.println(Arrays.toString(a1));//prints given numbers in horizontal order
 //arrays to take i/p from user

 s1.close();
 
	}

}
