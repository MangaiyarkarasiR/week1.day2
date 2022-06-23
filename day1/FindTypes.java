package week2.day1;

public class FindTypes 
{

public static void main(String[] args) 
{
//	declare the input as below
	String test = "$$ Welcome to 2nd Class of Automation $$ ";
	int  letter = 0, space = 0, num = 0, specialChar = 0;
//	Split each character of the String into an array
	char[] arr1=test.toCharArray();
//	get the length of an array
	int len=arr1.length;
//	traverse through each letter 
	for(int i=0;i<len;i++)
		{
//find the types of each character using below method 		
		 if(Character.isLetter(arr1[i])) 
//		increase the count if the type is letter
			 letter+=1;
//		 increase the count if the type is number
		else if(Character.isDigit(arr1[i]))
			num+=1;
//		 increase the count if the type is space
		else if(Character.isSpaceChar(arr1[i]))
			space+=1;
		else
//			increase the count if the type is specialCharacter
			specialChar+=1;
		}
	System.out.println("letter: " + letter);
	System.out.println("space: " + space);
	System.out.println("number: " + num);
	System.out.println("specialCharcter: " + specialChar);
		
}

}
