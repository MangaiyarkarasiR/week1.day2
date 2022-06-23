package week2.day1;

public class Palindrome 
{
public static void main(String[] args) 
{
//	declare the input as below
	String s1="madam";
	String rev="";
//	get the length of the String
	int len= s1.length();
//	traverse through each character starting from the last letter using length of the string
	for (int i=len-1;i>=0;i--)
	{
//get the character at each position  	
	char ch =s1.charAt(i); 
//	add the character to a string variable
	rev=rev+ch;
	}
//	check the reversed string and input string are equal
	if(rev.equalsIgnoreCase(s1)==true)
	{
//		print PalinDrome if both are equal
		System.out.println("palinDrome");
	}
}
	
}


