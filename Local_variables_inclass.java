package basicprograms;

public class Local_variables_inclass {
	static int a=500;
 double b=44.9;
static String c;
	static void add()
	{
		 a=98; //this is how u update the value of global varaible
		 Local_variables_inclass l1=new Local_variables_inclass();
		 l1.b=67.2;//this is how u update the value of global varaible
	
	}

	public static void main(String[] args) 
	{
		Local_variables_inclass l1=new Local_variables_inclass();
		
			System.out.println(l1.a);
			//System.out.println(b);
			System.out.println(c);

	}

}
