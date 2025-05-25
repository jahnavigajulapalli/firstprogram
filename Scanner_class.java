package basicprograms;

import java.util.Scanner;

public class Scanner_class {
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);//here if u don't pass parameters then it will show compile time error because scanner class contains 16 constyructors but none of them are parameterised
		String input=s1.next();
		System.out.println("name"  +input);
		int a=s1.nextInt();
		System.out.println("enter a value " +a);
		byte b=s1.nextByte();
		System.out.println("enter b value " +b);
		short s=s1.nextShort();
		System.out.println("enter s value " +s);
		long l=s1.nextLong();
		System.out.println("enter l value " +l);
		float f=s1.nextFloat();
		System.out.println("enter f value " +f);
		double d=s1.nextDouble();
		System.out.println("enter d value " +d);
		boolean t=s1.nextBoolean();
		System.out.println("enter t value " +t);
		s1.close();
		
		
		
		
		
		
		

		
		
	}

}
