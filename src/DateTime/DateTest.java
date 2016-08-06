package DateTime;
import java.util.*;
import java.lang.*;
public class DateTest {
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Date a = new Date();
		System.out.println("Enter the day : ");
		int date = sc.nextInt();
		System.out.println("Enter the month : ");
		int month = sc.nextInt();
		System.out.println("Enter the year : ");
		int year = sc.nextInt();
		
		a.setDay(date);
		a.setMonth(month);
		a.setYear(year);
		
		a.displayDate();
	}
	
}
	
	
	


