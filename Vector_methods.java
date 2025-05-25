package basicprograms;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Vector_methods {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(3);
		v1.add("add");
		v1.add("sub");
		v1.add(36);
		System.out.println(v1);
		Enumeration e1=v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}

	}

}
