package week1.Day2;

import java.util.Arrays;

public class MissingElementInAnArray 
{

	public static void main(String[] args)
	  {
		int[] arr = {1,2,3,4,7,6,8};
		int length = arr.length;
			Arrays.sort(arr);//sorting the given array
				for( int i =1;i<=length;i++) 
					{
						if (i!=arr[i-1])//condition check for the iterator variable not equal to array valu
							{
								System.out.println("The missing element is :"+i);
								break;
							}
					}
	}
	
}
