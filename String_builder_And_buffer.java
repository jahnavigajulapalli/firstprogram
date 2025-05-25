package basicprograms;

public class String_builder_And_buffer {

	public static void main(String[] args) {
		String s2="jahnavi";
		s2.concat(" in automation");// here concatenation will not work because strings are immutable in nature and here append function will not work in string because they are not predefined
		System.out.println(s2);
		
		StringBuilder s4=new StringBuilder("jahnavi ");
		s4.append("in automation");// in string builder change of strings is possible because they are mutable in nature, and here concatenation can not be used because they are not predefined
		System.out.println(s4);
		
		StringBuffer s5=new StringBuffer("jahnavi ");
		s5.append("in automation batch 54");//in string buffer change of strings is possible because they are mutable in nature, and here concatenation can not be used because they are not predefined
		System.out.println(s5);
		
	}

}
