package week1.Day2;

public class MyCar 
{
	public static void main(String[] args) 
	{
//		object creation for existing class Car2 and calling the methods from that class
		Car2 obj=new Car2();
		obj.applyBreak();
//		obj.applyGear(); As it is private method
		boolean acc=obj.applyAcclerate();
		int AC=obj.switchOnAc();
		System.out.println(AC);
		System.out.println(acc);
	}

}

