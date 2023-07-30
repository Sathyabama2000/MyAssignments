package assignmentprogram;

public class ChangeEvenIndexToUpper {

	public static void main(String[] args) {
		//declare a string
		String text="testleaf";
		//convert string to char array
		char[] text1 = text.toCharArray();
		//iterate for loop
		for(int i =0 ;i<text1.length;i++)
		{
			//check the condition
			if(i%2==0)
			{
				//print even chars in uppercase
				System.out.print(Character.toUpperCase(text1[i]));
				
			}
			else
			{
				//print the odd chars in lowercase
				System.out.print(text1[i]);
			}
		}
		


	}

}
