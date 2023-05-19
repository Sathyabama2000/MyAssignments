package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 = "stops";
		String text2 = "potss"; 
		int len1 = text1.length();
		int len2 = text2.length();
		if(len1==len2)
		{
			System.out.println("both the strings length are same");
		}
		char[] arr1=text1.toCharArray();
		char[] arr2=text2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
				
		if(arr1.equals(arr2))
		{
			System.out.println("both the words are same");
		}
		else
		{
			System.out.println("both the words are not same");
		}
	}

}
