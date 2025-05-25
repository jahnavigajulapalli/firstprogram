package basicprograms;

public class Continue_keyword {
	
	public static void main(String[] args) {
		for(int i=0;i<9;i++) {
			
			  if(i==1)
			  { 
				  continue;//here continue means at i=1 it does not print i value but continues the loop
				  }
			 
			
			if(i==7) {
				break;//here break means the loop stops when i==7 so it prints upto n-1 values i.e i=6
			}
			
			System.out.println(i);
		}
		
		
		}
		

	}


