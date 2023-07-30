package assignmentprogram;

public class Factorial {

	public static void main(String[] args) {
        //declare a variable and initialize it to 1
		int fact=1;
		//iterate the for loop
		for(int i=5;i>=1;i--)
		{
			//multiply iteration value with fact value
			fact = fact*i;
			
		}
		//print the factorial value
		System.out.println(fact);
		

	}

}
