package week1.Day2;

public class TwoWheeler 
{
//	globally declared variables;
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=35698245693l;
	boolean isPunctured=false;
	String bikeName="Pulsar";
	double runningKM=2000.01;
	public static void main(String[] args)
{
	TwoWheeler obj= new TwoWheeler();
	System.out.println("Numberof Wheels:"+obj.noOfWheels);
	System.out.println("Number of Mirrors:"+obj.noOfMirrors);
	System.out.println("Chassis Number:"+obj.chassisNumber);
	System.out.println("Twowheeler Punctured:"+obj.isPunctured);
	System.out.println("Name:"+obj.bikeName);
	System.out.println("Running KM:"+obj.runningKM);
}
}
