package basicprograms;

public class Math_class {

	public static void main(String[] args)
	{
		System.out.println(Math.addExact(12, 23));//performs addition of 2 int values
		System.out.println(Math.addExact(12455, 238888));//performs addition of 2 long values
		System.out.println(Math.subtractExact(12, 23));//performs substraction of 2 int values
		System.out.println(Math.subtractExact(156772, 123453));//performs substraction of 2 long values
		System.out.println(Math.multiplyExact(15, 12));//performs multiplication of 2 int values
		System.out.println(Math.subtractExact(15, 123453));//performs multiplication of 1 int&1 long values
		System.out.println(Math.subtractExact(156772, 123453));//performs multiplication of 2 long values
		System.out.println(Math.min(12, 13));//returns minimum value of 2 int numbers
		System.out.println(Math.min(122222, 1456773));//returns minimum value of 2 long numbers
		System.out.println(Math.min(12.123, 13.1122));//returns minimum value of 2 float numbers
		System.out.println(Math.min(12.123456, 13.45678));//returns minimum value of 2 double numbers
		System.out.println(Math.max(12, 13));//returns maximum value of 2 int numbers
		System.out.println(Math.max(122222, 1456773));//returns maximum value of 2 long numbers
		System.out.println(Math.max(12.123, 13.1122));//returns maximum value of 2 float numbers
		System.out.println(Math.max(12.123456, 13.45678));//returns maximum value of 2 double numbers
		System.out.println(Math.abs(12));//returns only positive value of int number
		System.out.println(Math.abs(-1267877));//returns only positive value of long number
		System.out.println(Math.abs(12.897));//returns only positive value of float number
		System.out.println(Math.abs(-12.89765543));//returns only positive value of double number
		System.out.println(Math.random());//returns only positive values from0.0 to 1.0, everytime u run random method it generates diff values
	}

}
