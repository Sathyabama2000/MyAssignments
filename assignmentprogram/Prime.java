package assignmentprogram;

public class Prime {

	public static void main(String[] args) {
		//declare a variable to store prime number
		int num=64;
		//declare another variable
		int flag=0;
		//iterate for loop from 1 to prime number
		for(int i=1;i<=num;i++)
		{
			//check the condition that remainder is equals to 0
			if(num%i==0)
			{
				//increment the flag value
				flag++;
			
		    }
		}
		//check that flag value is equals to 2
		if(flag==2)
		{
			//print the num is prime
			System.out.println( num+" is prime");
				
	    }
		else
		{
			//else print number is not prime
			System.out.println(num+" is not prime");
		}
	}

}
