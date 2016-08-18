/* --------------PROGRAM SUBMITTED BY SHREYAS B(2015103073)--------------*/
package dateDetails;
import java.util.*;
public class Date 
{
	private int date,
				month,
				year;
	//constructor
	public Date(int d,int m,int y)
	{
		date=d;
		month=m;
		year=y;
	}
	Scanner in=new Scanner(System.in);
	public void setDate()
	{
		System.out.println("Enter the date(dd)");
		date=in.nextInt();
		
	}
	public void setMonth()
	{
		System.out.println("Enter the month(mm)");
		month=in.nextInt();
		
	}
	public void setYear()
	{
		System.out.println("Enter the year(yyyy)");
		year=in.nextInt();
		
	}
	public void getDate()
	{
		System.out.println("The date is "+this.date);
		
	}
	public void getMonth()
	{
		System.out.println("The month is "+this.month);
	}
	public void getYear()
	{
		System.out.println("The year is "+this.year);
	}
	public void displayDate()
	{
		System.out.println("date is: "+this.date+"/"+this.month+"/"+this.year);
	}
}
