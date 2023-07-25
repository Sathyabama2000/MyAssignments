package week2.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		int flag=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				flag++;
			
		    }
		}
		if(flag==2)
		{
			System.out.println( num+" is prime");
				
	    }
		else
		{
			System.out.println(num+" is not prime");
		}

}
}
