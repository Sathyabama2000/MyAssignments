package assignmentprogram;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		//declare an array
		 int[] arr2 = {1,6,4,3,2};
		 //sort the array
		 Arrays.sort(arr2);
		
		 //iterate for loop upto array length
		 for(int i=0;i<arr2.length;i++)
		 {
			// declare a variable and assign i+1
			 int j=i+1;
			 //check the array value is not equal to j
			 if(arr2[i]!=j) 
			 {
				 //print the missing element
				 System.out.println(j);
				
				 break;
			 }
		 }
		 
		 

	}

	}


