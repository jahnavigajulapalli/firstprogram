package basicprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_iteration {

	public static void main(String[] args) {
		Map<Integer,String> m2=new HashMap<Integer,String>();
		m2.put(1293, "jaan");
		m2.put(1234, "jaanuut");
		m2.put(12783, "jahn");
		m2.put(198723, "jahnavi");
		m2.put(109723, "jaavi");
		System.out.println(m2);
		//maps can be iterated in 3 ways
		//keyset-->gives keys
		//values-->gives values
		//entryset-->gives keys and values
		for(Integer a :  m2.keySet()) {//gives only keys
			System.out.println(a);
		}
		for(String a :  m2.values()) {//gives only values
			System.out.println(a);
		}
		for(Entry<Integer,String> a :  m2.entrySet()) {//gives key and values pairs
			System.out.println(a);
		}
		//iterating map using iterator
		System.out.println("iterating map using iterator  ");
		Set<Entry<Integer,String>> s1=m2.entrySet();
		Iterator<Entry<Integer,String>> i1=s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
	}

}
