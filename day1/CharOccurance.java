package week2.day1;

import java.util.Iterator;

public class CharOccurance
{
	public static void main(String[] args)
{
//		declare the input as below
		String str = "welcome to chennai";		
		int count=0;
//		Split each character of the String into an array
		char[]arr1= str.toCharArray();
//		get the length of an array
		int len =arr1.length;
//		traverse through each letter 
		for(int i=0;i<len;i++)
		{
//		Check if the character is 'e'
			if(arr1[i]=='e')
			{
//		if it is 'e' increase the count 
				count=count+1;
			}
		}
		System.out.println("'e' has occured for "+count +" times");
	}
	}
	


