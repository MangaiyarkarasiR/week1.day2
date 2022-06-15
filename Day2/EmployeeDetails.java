package week1.Day2;

public class EmployeeDetails 
{
	public static void main(String[] args) 
	{
//		object creation and calling methods of a class
		EmployeeDetails obj =new EmployeeDetails();
		obj.printEmployeeName("Mangai",515621);
		String Address= obj.getEmployeeAddress("Trichy");
		System.out.println("Employee Addres:"+Address);
		double salary=obj.printEmployeeSalary(40000.010);
		System.out.println("Employee Salary:"+salary);
		obj.printEmployeeMobileNumber(789102522153l);
	}
	private void printEmployeeName(String empName,int empId)
	{
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee ID:"+empId);
	}
	private String getEmployeeAddress(String empAddress) 
	{
		return empAddress;
	}
	
	public double printEmployeeSalary(double empSalary)
	{
		return empSalary ;
	}
	  void printEmployeeMobileNumber(long mobNum)
	{
		 System.out.println("Phone Number:"+mobNum);
    }

}
