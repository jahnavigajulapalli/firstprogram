package basicprograms;

public class Nested_if {
	public static void main(String[] args) 
	{
		int a=12;
		int b=15;
		if(a>b)
		{
			if(a!=b)
			{
				System.out.println("block1");
				if(a==b)
				{
					System.out.println("block2");
				}
			}
		System.out.println("true"); 
		
		}
		else
		{
			if(a<=b)
			{
				System.out.println("else block");
			}
			System.out.println("condition is false");
		}
		}
}
