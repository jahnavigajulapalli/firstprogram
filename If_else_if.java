package basicprograms;

public class If_else_if 
{
	public static void main(String[] args) 
	{
		int a=12;
		int b=15;
		if(a<b)
		{
		System.out.println("true"); //if first condition true if block will execute and it will not check for other conditions if first condition is false it will go for second conditon.if both conditions are false then else block will execute
		
		}
		else if(a<b)
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("condition is false");
		}
		}
	
}

