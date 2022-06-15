package week1.Day2;

public class Car2 {
	public static void main(String[] args)
	{
//object creation and calling methods		
		Car2 obj =new Car2();
		obj.applyBreak();
		obj.applyGear();
		obj.applyAcclerate();
		int AC=obj.switchOnAc();
		System.out.println(AC);
	}
//	Methods for class Car2
	public void applyBreak()
		{
			System.out.println("Method1:Apply Break ");
		}
	
	private void applyGear()
		{
			System.out.println("Method2:Apply Gear");
		}
	public int switchOnAc()
		{	
		return 1;
		}
	boolean applyAcclerate()
		{
			return true;
		}
	}


