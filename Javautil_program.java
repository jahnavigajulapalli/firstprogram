package basicprograms;
import java.util.Scanner;
public class Javautil_program {

	public static void main(String[] args) 
	{

			Scanner s1=new Scanner(System.in); //giving CTE becase there are no
			//non parametrized consteuctors present in scanner class
			String input=		s1.next(); //String values
			int a=		s1.nextInt();  //int
			byte b=		s1.nextByte(); //byte
			float c=		s1.nextFloat(); //float
			long d=		s1.nextLong(); //long
			boolean b1=		s1.nextBoolean(); //boolean
			short w=		s1.nextShort(); //short
			double p=		s1.nextDouble(); //double
			s1.close();		
		
	}

}
