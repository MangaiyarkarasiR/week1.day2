package week1.Day2;

public class PrintDuplicatesInArray 
{
	public static void main(String[] args)
{
	int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	int length=arr.length;//get length of given array
		for(int i=0;i<length-1;i++)
			{  
			int count=0;//initialise count =0
				for(int j=i+1;j<=length-1;j++)//start loop from a[2] to last element 
					{	
						if(arr[i]==arr[j])//comparing the array elements for equal values
							{
								count++;              
							}	      
					}
			if(count>0)
				{
					System.out.println(arr[i]+" is duplicated");	
				}	 
			}
}
}
