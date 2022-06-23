package week2.day1;

public class ReverseEvenWords 
{
public static void main(String[] args) 
{
//	 Declare the input as below
 String test = "I am a software tester"; 
// Split the string in to n  array 
 String[] s1=test.split(" ");
// get the length of an array
 int len= s1.length; 
 
 String temp="";
 String revstr="";
// traverse through each word using for loop
 for(int i=0;i<len;i++)
 {
//	 i=0 ,because array index starts from 0;
//so for even positions the indexes will 1,3...	 
//	 Find the odd indexes using mod operator within the loop
	 if(i%2!=0)
	 {
//Convert the string to char array to reverse it 	
		 char[] ch=s1[i].toCharArray();
//		 traverse through each letter starting from last character using length of the array
		 for(int j=ch.length-1;j>=0;j--)
		 {
//	add each character to the string variable 	 within the loop	  
			 revstr=revstr+ch[j];			 
		 } 
//add the reversed string to a temp variable 		 
		 temp=temp+revstr+" ";
	 }
	 else
	 {
// add the string as it is to a temp variable		 
		temp=temp+s1[i]+" "; 
	 }		 
}
// print the output
 System.out.println(temp);
}
}
 	