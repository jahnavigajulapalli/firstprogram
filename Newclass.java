package basicprograms;

import java.util.Scanner;

public class Newclass {

	public static void main(String[] args) 
	{

		Scanner s1=new Scanner(System.in);
		System.out.println("ENter the value of a");
		int a=	s1.nextInt();
		System.out.println("ENter the value of b");
		int b=	s1.nextInt();
		int sum=a+b;
		System.out.println("The sum of the 2 no:->");
		System.out.println(sum);
		s1.close();
		
	}

}
