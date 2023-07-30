package assignmentprogram;

public class Duplicate {

	public static void main(String[] args) {
		//declare an array
		 int[] num = { 11,21,31,21,8,9,11};
		 //iterate for loop upto array length
	       for(int i=0;i<num.length;i++)
	       {
	    	   //iterate another for loop 
	    	   for(int j=i+1;j<num.length;j++)
	    	   {
	    		   //compare the array value and check if equals
	    		   if(num[i]==num[j])
	    		   {
	    			   //print duplicate
	    			   System.out.println(num[i]);
	    		   }
	    	   }
	       }
		}
	}


