package basicprograms;

import java.util.Arrays;

public class Anagram_program {

	public static void main(String[] args) {
		String s="bus";
		String s1="but";
		if(s.length()!=s1.length()) {
			System.out.println("length is same");
		}
		else {
			//System.out.println("not anagram");
		
		char c1[]=s.toCharArray();
		char c2[]=s1.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println("string 1 is" + Arrays.toString(c1));
		System.out.println("string 2 is" + Arrays.toString(c2));
		if(Arrays.equals(c1,c2)) {
			System.out.println("Anagram");
			
		}
		else {
			System.out.println("not satisfies so not anagram");
		}
		}

	}

}

