package basicprograms;

import java.util.HashSet;
import java.util.Set;

public class Set_methods {

	public static void main(String[] args) {
		Set s1=new HashSet();//upcasting is used
		s1.add("jaanu");//adds object
		s1.add("lucky");
		s1.add(null);//set accepts only 1 null value
		s1.add(null);
		s1.add("jaanu");//set will not store duplicate values
		System.out.println(s1);
		Set<Integer>s2=new HashSet<Integer>();
		s2.add(3);
		s2.add(6);
		s2.add(64);
		s2.add(36);
		System.out.println(s2);
		s2.addAll(s1);//adds collection
		System.out.println("after adding " +s2);

	}

}
