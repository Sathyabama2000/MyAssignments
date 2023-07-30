package assignmentprogram;

public class Fibonacci {

	public static void main(String[] args) {
		//declare a variable and initialize it to 0
		int firstNum = 0;
		//declare a variable and initialize it to 1
		int secondNum = 1;
		//declare a variable and initialize it to 0
		int sum = 0;
		//print the first number in the series
		System.out.println(firstNum);
		//print the second number in the series
		System.out.println(secondNum);
		//iterate a for loop for the series
		for(int i =3;i<=11;i++)
		{
			//add the firstnum and secondnum value and assign it to sum variable
			sum= firstNum+secondNum;
			//assign secondnum value to firstnum variable
			firstNum = secondNum;
			//assign sum value to secondnum variable
			secondNum= sum;
			//print the series
			System.out.println(sum);
			
		}
		

	}

}
