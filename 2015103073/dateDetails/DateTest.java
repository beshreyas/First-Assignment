/* --------------PROGRAM SUBMITTED BY SHREYAS B(2015103073)--------------*/
package dateDetails;
import java.util.*;
public class DateTest {

	public static void main(String[] args) 
	{
		Date d1=new Date(17,11,1997);
		d1.getDate();
		d1.getMonth();
		d1.getYear();
		d1.displayDate();
		//Setting new date
		System.out.println("Set the new date");
		d1.setDate();
		d1.setMonth();
		d1.setYear();
		//Displaying new date
		System.out.println("Displaying the new date");
		d1.getDate();
		d1.getMonth();
		d1.getYear();
		d1.displayDate();
	}

}
