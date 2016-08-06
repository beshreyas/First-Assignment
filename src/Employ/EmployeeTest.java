package Employ;
import java.util.*;
import java.lang.*;
public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee a = new Employee();
		Employee b = new Employee();
		
		System.out.println("Enter Employee 1`s First Name : ");
		String fname= sc.next();
		System.out.println("Enter Employee 1`s Last Name : ");
		String lname= sc.next();
		System.out.println("Enter Employee 1`s Monthly Salary : ");
		double salary= sc.nextDouble();
		a.setFirstName(fname);
		a.setLastName(lname);
		
		if(salary>0)
		a.setSalary(salary);
		
		else
		{
			System.out.println("Enter a positive value for Salary : ");
			salary= sc.nextDouble();
			a.setSalary(salary);
		}
		
		System.out.println("Enter Employee 2`s First Name : ");
		fname= sc.next();
		System.out.println("Enter Employee 2`s Last Name : ");
		lname= sc.next();
		System.out.println("Enter Employee 2`s Monthly Salary : ");
		salary= sc.nextDouble();
		b.setFirstName(fname);
		b.setLastName(lname);
		
		if(salary>0)
		b.setSalary(salary);
		
		else
		{
			System.out.println("Enter a positive value for Salary : ");
			salary= sc.nextDouble();
			b.setSalary(salary);
		}
		
		
		
		
		System.out.println("Employee 1`s First Name : "+ a.getFirstName());
		System.out.println("Employee 1`s Last Name : "+ a.getLastName());
		System.out.println("Employee 1`s Yearly Salary : "+ a.getSalary()*12);
		a.setSalary(a.getSalary()*1.1);
		System.out.println("Employee 1`s Yearly Salary after 10% increment : "+ a.getSalary()*12);
		
		System.out.println("Employee 2`s First Name : "+ b.getFirstName());
		System.out.println("Employee 2`s Last Name : "+ b.getLastName());
		System.out.println("Employee 2`s Yearly Salary : "+ b.getSalary()*12);
		b.setSalary(b.getSalary()*1.1);
		System.out.println("Employee 2`s Yearly Salary after 10% increment : "+ b.getSalary()*12);
		
		
		
		
		
	}

}
