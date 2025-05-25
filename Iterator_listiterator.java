package basicprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator_listiterator {

	public static void main(String[] args) {
		List l=new ArrayList();//here list is parent class and arraylist is child class , here we are doing upcasting to find methods of list
		l.add("jaanu");//adds object
		l.add('p');
		l.add(true);
		l.add(23);
		l.add(2.34);
		l.add(345678965);
		System.out.println(l);
		List l1=new ArrayList();//here list is parent class and arraylist is child class , here we are doing upcasting to find methods of list
		l1.add("jutu");//adds object
		l1.add("i");
		l1.add("false");

		System.out.println(l1);
		Iterator i1=l.iterator(); //iterator is an abstract method&Iterator is an interface, and it has 2 methods in it
		i1.hasNext();//used to find wheter the next element is present or not
		System.out.println(i1.next());//used to give the next element
	//here we use while loop concept because collection has dynamic values and if we don't the number the iterartions
	//using iterator we can find elements in forward direction
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
	ListIterator<String> li=l1.listIterator();//listIterator is an abstract method&ListIterator is an interface, and it has 4 methods in it
	

//using listiterator we can find elements in forward and backward direction. but it is not possible to find backward direction without forward direction=
while(li.hasNext()) {
	System.out.println(li.next());
}
while(li.hasPrevious()) {//checks previous elements are present or not
	System.out.println(li.previous());//prints elements from last
}
	
	}
	
	
	


}
