package employeeDetails;
/* --------------PROGRAM SUBMITTED BY SHREYAS B(2015103073)--------------*/
public class EmployeeTest {

	public static void main(String[] args) {
		//initializing using constructors
		Employee emp1=new Employee("Sachin","Tendulkar",-50.00);
		Employee emp2=new Employee("Virender","Sehwag",1000.00);
		
		//Displaying after initialization with constructors
		System.out.print("Displaying the initial employee details\n");
		//Employee 1 details
		System.out.print("Employee 1's details:\n");
		emp1.getFirstName();
		emp1.getLastName();
		emp1.getMonthlySalary();
		
		//Employee 2 details
		System.out.print("Employee 2's details:\n");
		emp2.getFirstName();
		emp2.getLastName();
		emp2.getMonthlySalary();
		
		//Setting values for both objects
		
		System.out.print("Enter the details of Employee 1:\n");
		emp1.setFirstName();
		emp1.setLastName();
		emp1.setMonthlySalary();
		
		System.out.print("Enter the details of Employee 2:\n");
		emp2.setFirstName();
		emp2.setLastName();
		emp2.setMonthlySalary();
		
		//Printing Values after Setting Values
		
		System.out.print("The details of Employee 1:\n");
		emp1.getFirstName();
		emp1.getLastName();
		emp1.getMonthlySalary();
		
		System.out.print("The details of Employee 2:\n");
		emp2.getFirstName();
		emp2.getLastName();
		emp2.getMonthlySalary();
		
		//Displaying Yearly Salary of both Employees
		
		System.out.print("Yearly Salaries:\n");
		
		System.out.print("Employee 1:\n");
		emp1.getFirstName();
		emp1.getLastName();
		emp1.getYearlySalary();
		
		System.out.print("Employee 2:\n");
		emp2.getFirstName();
		emp2.getLastName();
		emp2.getYearlySalary();
		
		//Raising the Salary and Displaying Yearly Salary of both Employees
		
		System.out.println("Raising the salaries by 10%...");
		
		System.out.println("Yearly Salaries after raise:");
		System.out.println("Employee 1:");
		emp1.getFirstName();
		emp1.getLastName();
		emp1.salaryRaise();
		
		System.out.println("Employee 2:");
		emp2.getFirstName();
		emp2.getLastName();
		emp2.salaryRaise();
		
	}

}
