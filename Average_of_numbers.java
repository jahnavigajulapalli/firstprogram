package basicprograms;

public class Average_of_numbers{
	public static void main(String[] args) {
		
	
	int sum=0;
	int [] input=new int[4];
	input[0]=23;
	input[1]=34;
	input[2]=23;
	input[3]=98;
	for (int i=input.length-1;i>=0;i--) {
		 sum = sum+input[i];
	}
	System.out.println(sum);
	double average=sum/input.length;
	System.out.println(average);
		

	}
	}

