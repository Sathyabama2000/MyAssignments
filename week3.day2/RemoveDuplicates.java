package week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		int count=0;
		String[] text1 = text.split(" ");
		int len = text1.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				
				if(text1[i].equals(text1[j]))
				{
					count++;
					if(count>1)
					{
						text1[i]="\"\"";
					}
				}
			}
			
			
		}
		for(int i=0;i<len;i++)
		{
			System.out.println(text1[i]);
		}
		

	}

}
