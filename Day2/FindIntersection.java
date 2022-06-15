package week1.Day2;

public class FindIntersection 
{
public static void main(String[] args) 
{
	int []arr1={3,2,11,4,6,7};
	int[] arr2= {1,2,8,4,9,7};
	
	int length1=arr1.length;
	int length2=arr2.length;
	for(int i=0; i<length1;i++)//loop for first array
	{
		for (int j=0;j<length2;j++)	//loop for second array
		{			
			if(arr1[i]==arr2[j])//compare vales from both arrays are equal
			{
				System.out.println("common value is:"+arr1[i]);			
			}
		}
	
	}	

}}
