package basicprograms;

import java.util.ArrayList;
import java.util.List;

public class List_methods {

	public static void main(String[] args) {
		List l=new ArrayList();//here list is parent class and arraylist is child class , here we are doing upcasting to find methods of list
		l.add("jaanu");//adds object
		l.add('p');
		l.add(true);
		l.add(23);
		l.add(2.34);
		l.add(null);
		l.add(null);//list accepts multiple null values
		l.add(23);//list allows to store duplicate values
		l.add(345678965);
		System.out.println(l);
		List<Character> l1=new ArrayList<Character>();//here list is parent class and arraylist is child class , here we are doing upcasting to find methods of list
		l1.add('j');//adds object
		l1.add('p');
		l1.add('t');
		l1.add('2');
		l1.add('2');
		l1.add(1, 't');//adds t at indexing position 1
		l1.addAll(l);//adds collection
		l.addAll(0, l1);//adds collection at indexing 0
		l.remove(3);//removes objects at indexing 3
		//l.removeAll(l);//removes collection
		System.out.println(l1);
		System.out.println(l);
		System.out.println(l.get(5));//gives object at index position 5
	}

}
