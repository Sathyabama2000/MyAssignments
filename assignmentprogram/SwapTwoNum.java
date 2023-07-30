package assignmentprogram;

public class SwapTwoNum {

	public static void main(String[] args) {
		//with temp variable
		//declare a variable
		int a=100; 
		//declare another variable
		int b=200;
		System.out.println("before swap a = "+ a + ", b = "+b);
		//declare a temporary variable and assign a to it		
	    int temp=a;
	    //assign b to a
	    a=b;
	    //assign temp to b
	    b=temp;
		//print a and b value	
	    System.out.println("after swap a = "+ a + ", b = "+b);
	    
	    //without temp variable
		 System.out.println("before swap a = "+ a + ", b = "+b);
		 //add a and b and assign it to a
		 a=a+b;
		 //sub b from a and assign it to b
		 b=a-b;
		 //sub b from a and assign it to a
		 a=a-b;
		 System.out.println("after swap a = "+ a + ", b = "+b);
		 
		 
				 
	}

}
