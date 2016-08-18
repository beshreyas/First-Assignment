package employeeDetails;
/* --------------PROGRAM SUBMITTED BY SHREYAS B(2015103073)--------------*/
import java.util.Scanner;

public class Employee 
{
	
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	
	public Employee(String fName,String lName,double mSalary) 
	{
			firstName=fName;
			lastName=lName;
			if(mSalary>0.0)
			{
				monthlySalary=mSalary;
			}
	}
	Scanner in=new Scanner(System.in);
	public void setFirstName()
	{
		System.out.print("Enter the first name :");
		firstName=in.next();
	}
	
	public void setLastName()
	{
		System.out.print("Enter the last name :");
		lastName=in.next();
	}
	
	public void setMonthlySalary()
	{
		double temp;
		System.out.print("Enter the monthly salary :");
		temp=in.nextDouble();
		if(temp>0.0)
		{
			monthlySalary=temp;
		}
	}
	
	public void getFirstName()
	{
		System.out.println("The first name of the employee is : "+firstName);
	}
	public void getLastName()
	{
		System.out.println("The last name of the employee is : "+lastName);
	}
	public void getMonthlySalary()
	{
		System.out.println("The Monthly salary of the employee is : "+monthlySalary);
	}
	public void getYearlySalary()
	{
		double ySalary=monthlySalary*12;
		System.out.println("The yearly salary of the employee is : "+ySalary);
	}
	public void salaryRaise()
	{
		double raise;
		raise=0.1*monthlySalary;
		monthlySalary=monthlySalary+raise;
		System.out.println("The current yearly salary the employee after raise is : "+(monthlySalary*12));
	}
}
