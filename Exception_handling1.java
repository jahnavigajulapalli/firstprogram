package basicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Exception_handling1 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		try {
			int [] rollno=new int[s1.nextInt()];
			for(int i=0;i<=rollno.length-1;i++) {
				System.out.println("enter rollno at position"+i);
				rollno[i]=s1.nextInt();
				
			}
			s1.close();
			System.out.println("the array output is ");
			System.out.println(Arrays.toString(rollno));
		}
		catch(NegativeArraySizeException n1) {
			System.out.println("size of array can never be negative");
			System.out.println("enter positive numbers only ");
			Scanner s2=new Scanner(System.in);
			System.out.println("Enter the size of array ");
			int [] rollno=new int[s2.nextInt()];
			for(int i=0;i<=rollno.length-1;i++) {
				System.out.println("enter rollno at position"+i);
				rollno[i]=s2.nextInt();
				
			}
			s2.close();
			System.out.println("the array output is ");
			System.out.println(Arrays.toString(rollno));
		}

	}

}
