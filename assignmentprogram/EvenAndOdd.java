package assignmentprogram;

public class EvenAndOdd {

	public static void main(String[] args) {
		//even number
     //iterate for loop from 1 to 20 to find even number
		for(int i=1;i<=20;i++) {
	 //check the condition that the remainder is equal to 0
			if(i%2==0)
			{
			//print the even number	
			 System.out.println("the even nos are: "+i);
			 } 
			}
		//odd number
		 //iterate for loop from 1 to 20 to find odd number
		for(int i=1;i<=20;i++) {
			 //check the condition that the remainder is not equal to 0
					if(i%2!=0)
					{
					//print the odd number	
					 System.out.println("the odd nos are: "+i);
					 } 
					}

	}

}
