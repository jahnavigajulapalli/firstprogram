package basicprograms;

public class Reverse_string_program {

	public static void main(String[] args) {
		String s="jahnavi";
		String s1="";
		for(int i=6;i>=0;i--)
		{
			char c1=s.charAt(i);
			s1=s1+c1;
			
		}
System.out.println(s1);
	}

}
