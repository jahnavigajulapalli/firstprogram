package basicprograms;

import java.net.MalformedURLException;
import java.net.URL;

public class Checked_execeptions {
	public static void main(String []args) throws InterruptedException, MalformedURLException {
		URL u1=new URL("https://www.google.com");
		for(int i=1;i<=50;i++) {
			System.out.println(i);
			Thread.sleep(1000);//here it shows add throws declaration so we will add that declaration
			
		}
		
	}

}
