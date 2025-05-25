package basicprograms;

public class And_with_or {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		//if(!(a>b || a<=b)) // here it can be multiple conditions also
		if(!(a>b || a<=b) && (a<b || a>=b))
		{
			System.out.println("condition satisfies");//here "or" condition is satisfies but here it is "not with or" so here the condition is false
		}
		else
		{
			System.out.println("false");
		}

	}

}
