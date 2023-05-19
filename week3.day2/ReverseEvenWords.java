package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester"; 
		String[] test1 = test.split(" ");
		for(int i=0;i<test1.length;i++)
		{
			if(i%2!=0) //odd index equals to even position words
			{
				char[] arr = test1[i].toCharArray();
				for(int j=arr.length-1;j>=0;j--)
				{
					System.out.print(arr[j]);
				}
				System.out.println();
			}
				else
				{
					System.out.println(test1[i]);
				}
				
			}
		}
		
		

	}


