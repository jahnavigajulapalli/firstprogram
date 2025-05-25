package basicprograms;

public class Switch_case {
static int a=10;
static int b=20;
static int c=89;

	public static void main(String[] args) {// when we use switch case means for suppose u have 10 logics or statements but u want to use only 1 logic then we will use switch case.
	switch(5) {
	case 1: System.out.println(a+b);
	break;
	case 2:System.out.println(a-b+c);
	break;
	case 3:System.out.println(a*b+c);
	break;
	case 4:System.out.println(a+b-c);
	break;
	case 5:System.out.println(a-b-c);//here we have not given break statement so it will continue to next logic or statement
	
	case 6:System.out.println(a+b+c);
	break;
	
	}

	}

}
