package basicprograms;

public class And_with_not {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		if(!(a>b && a<=b))
		{
			System.out.println("condition satisfies");//here "and" condition is satisfies but here it is "not with and" so here the condition is false
		}
		else
		{
			System.out.println("false");
		}

	}

}
