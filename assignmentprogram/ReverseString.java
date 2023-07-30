package assignmentprogram;
//using scanner to reverse the string
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		//create a object using scanner class
		Scanner scan = new Scanner(System.in);
		//get the input from user
		 System.out.println("enter input:");  
		 //declare a string variable to store the string
		 String name = scan.nextLine(); 
		//declare a character array to store the character array
		 //convert the string to char array
		char[] charArray = name.toCharArray();
		
		//iterate for loop in reverse to print the reversed string
		for(int j=charArray.length-1;j>=0;j--)
		{
			System.out.print(charArray[j]);
		}

	}

}
