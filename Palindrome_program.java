package basicprograms;

public class Palindrome_program {

	public static void main(String[] args) {
		String input="mom";
		String reversed="";
for (int i=input.length()-1;i>=0;i--){
char c1=input.charAt(i);
reversed=reversed+c1;
}
		
if (input.equals(reversed)) {
	System.out.println("they are palindrome");
	
}
else {
	System.out.println("not palindrome");
}
	}

}

