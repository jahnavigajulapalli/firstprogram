package basicprograms;

import java.util.Arrays;

public class String_functions {

	public static void main(String[] args) {
		String a="jahnavi " ;
		String y="Ruthvika";
		int a1=a.length();//gives length of the string, returns int value
		boolean b=a.equals("ruthvika");//compare 2 strings, returns boolean value
		System.out.println(a1);
		System.out.println(b);
		boolean b1=a.contains("the");//it checks given string is present or not, returns boolean value
		System.out.println(b1);
		String u=a.toUpperCase();//converts to upper case letters, return type is string
		System.out.println(u);
		String o=y.toLowerCase();//converts to lower case letters, return type is string
		System.out.println(o);
		String c=a.concat(y);//concatenates 2 strings 
		//both the below methods can be used to concatenate
		System.out.println(c);
		System.out.println(a.concat(" in automation batch"));
		String name=a.substring(3);//prints from the index 3 to the end of the string, starts from index "0", return type is String
		System.out.println(name);
		String name1=y.substring(3,6);// prints from the index 3 to n-1(5)
		System.out.println(name1);
		boolean e=a.equalsIgnoreCase(y);//ignores lower and upper cases and checks are equality of 2 strings, return type is boolean
		System.out.println(e);
		char c1=a.charAt(3);//prints character at given index, return type is char
		System.out.println(c1);
		int i=y.indexOf("t");//prints index of the given string, return type is int
		System.out.println(i);
		int i1=y.lastIndexOf("");//prints last index value of given string, return type is int
		System.out.println(i1);
		String s=a.trim();//remove the extra space in start and end of the string, return type is string
		System.out.println(s);
		String q=a.replace('h', 'n');//replacing characters,the first character in string replces with given second chracter , return type is string
		System.out.println(q);
		String w=a.replaceAll("jnavi","avi");//replacing strings, replaces the complete string
		System.out.println(w);
		String r=a.replace("avi","na");//replacing first string second given string, return type is string
		System.out.println(r);
		String t=a.repeat(6);//repeats the given string, return type is string
		System.out.println(t);
		boolean q1=a.matches("a(.*)");//checks the given string starts with a and rest can be anything, return type is boolean
		System.out.println(q1);
		boolean q2=y.matches("(.*)a");//checks given string ends with i or not
		System.out.println(q2);
		boolean q3=a.matches("........");//checks wheter the given string consists of 8 letters or not, here the dots represents the length
		System.out.println(q3);
		String inpput="chandra sekhar reddy gajulapalli";
		String [] l=inpput.split(" ");//splits the given string
		System.out.println("spliting "+ Arrays.toString(l));
		String [] l1=inpput.split(" ", 2);//here, it splits only at the first space at given string
		System.out.println("spliting "+ Arrays.toString(l1));
	}

}
