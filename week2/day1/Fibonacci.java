package week2.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNum = 0;
		int secondNum = 1;
		int sum = 0;
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		for(int i =3;i<=11;i++)
		{
			
			sum= firstNum+secondNum;
			firstNum = secondNum;
			secondNum= sum;
			System.out.println(sum);
			
		}
		

	}

}
