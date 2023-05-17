package week3.day1;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int len = arr.length;
		int count=0;
		for(int i=0;i<len-1;i++)  //outer loop
		{
			for(int j=i+1;j<arr.length;j++)  //inner loop
			{
				if(arr[i]==arr[j])
				{
					System.out.println("duplicate elements: " + arr[i]);
					count++;
										
				}
				
			}
			
		}
		System.out.println("count of duplicate elements: " + count);
		
	}

}
