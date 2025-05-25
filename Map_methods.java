package basicprograms;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Map_methods {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put(123, "jaan");
		m1.put(1234, "jaanu");
		m1.put(12783, "jahn");
		m1.put(19823, "jahnavi");
		m1.put(10923, "jaavi");//adds object in key and value pair
		System.out.println(m1);
		Map<Integer,String> m2=new HashMap<Integer,String>();
		m2.put(1293, "jaan");
		m2.put(1234, "jaanuut");
		m2.put(12783, "jahn");
		m2.put(198723, "jahnavi");
		m2.put(109723, "jaavi");
		System.out.println(m2);
		boolean b1=m1.equals(m2);//checks equality of map
		System.out.println(b1);
		m2.putAll(m1);//adds entire map
		System.out.println("after adding map" +m2);
		System.out.println(m2.containsKey(1234));//checks the key present or not
		System.out.println(m2.containsValue("jahnavi"));//checks the value present or not
		m1.remove(123); //removes key and value by giving only key object
		m1.remove(1234, "jaanu");//removes key and value by giving key and value
		System.out.println("after removing" +m1);
		m1.replace(12783, "jahu");//it replaces the value at given key
		m1.replace(109723, "jaavi", "javi");//it replces the old value with new value at given key
		System.out.println("after replacing" +m1);
		m1.putIfAbsent(1234, "jaanu");//adds only if key and value are not present
		System.out.println("after adding" +m1);
		System.out.println(m1.get(1234));//gives value present with that key
		
	}

}
