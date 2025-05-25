package basicprograms;

import java.util.ArrayList;//collection and arraylist are from java.util package need to be imported
import java.util.Collection;

public class Collection_methods {

	public static void main(String[] args) {
		Collection c1=new ArrayList();//here Collection is parent class to know the methods of collection we used the upcasting(array list is a child class) because collection is a interfface  and we don't create object
				c1.add("jaanu");//adds object
				c1.add(23);
				c1.add(12.22);
				c1.add('r');//we are getting warning msgs because, we have not specified the class(datatype)
				System.out.println(c1);
				Collection<String> c2=new ArrayList<String>();//here Collection is parent class to know the methods of collection we used the upcasting(array list is a child class) because collection is a interfface  and we don't create object
				c2.add("jaanu");
				c2.add("23");
				c2.add("12.22");
				c2.add("r");//we are dont get warning msgs because, we have specified the class(datatype)
				System.out.println(c1);
				Collection c3=new ArrayList();//here Collection is parent class to know the methods of collection we used the upcasting(array list is a child class) because collection is a interfface  and we don't create object
				c3.add("jaanu");
				c3.add(23456);
				c3.add(12.225677);
				c3.add('u');
				c1.addAll(c3);//adds complete collection to another collection
				System.out.println(c1);
				System.out.println(c1.contains("jaanu"));//checks object is present or not
				System.out.println(c2.containsAll(c1));//checks collection contains or not
				c2.remove("r");//removes object
				System.out.println(c2);
				//c1.removeAll(c1);//removes collection
				//System.out.println(c1);
				System.out.println(c2.equals(c1));//checks 2 collections are equal or not
				c1.clear();//clears collection
				System.out.println(c1);
				
				
	}

}
