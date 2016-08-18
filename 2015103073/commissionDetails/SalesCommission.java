/* --------------PROGRAM SUBMITTED BY SHREYAS B(2015103073)--------------*/
package commissionDetails;
import java.util.*;
import java.lang.*;
public class SalesCommission {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of sales persons");
		int n=input.nextInt();
		int salesPerson[]=new int[n];
		System.out.println("Enter the gross sales for the week for each sales person:");
		
		//Calculating salary for each sales person
		for(int i=0;i<n;i++)
		{
			int salesWeek;
			System.out.println("Enter the gross sales for sales person "+(i+1));
			salesWeek=input.nextInt();
			salesPerson[i]=(int) (200+(0.09*salesWeek));
			
		}
		int count[]=new int[9];//creating array counter
		
		//initializing all the counters to zero
		for(int i=0;i<9;i++)
		{
			count[i]=0;
		}
		
		for(int i=0;i<n;i++)
		{
			if(salesPerson[i]<300)
			{
				count[0]++;
			}
			else if(salesPerson[i]<400)
			{
				count[1]++;
			}
			else if(salesPerson[i]<500)
			{
				count[2]++;
				
			}
			else if(salesPerson[i]<600)
			{
				count[3]++;
			}
			else if(salesPerson[i]<700)
			{
				count[4]++;
			}
			else if(salesPerson[i]<800)
			{
				count[5]++;
			}
			else if(salesPerson[i]<900)
			{
				count[6]++;
			}
			else if(salesPerson[i]<1000)
			{
				count[7]++;
			}
			else
			{
				count[8]++;
			}
		}
		
		//Printing the data
		
		System.out.println("Salary Range         |   Number of Sales Persons");
		System.out.println("$200-$299            |   "+count[0]);
		System.out.println("$300-$399            |   "+count[1]);
		System.out.println("$400-$499            |   "+count[2]);
		System.out.println("$500-$599            |   "+count[3]);
		System.out.println("$600-$699            |   "+count[4]);
		System.out.println("$700-$799            |   "+count[5]);
		System.out.println("$800-$899            |   "+count[6]);
		System.out.println("$900-$999            |   "+count[7]);
		System.out.println("$1000 and above      |   "+count[8]);
		
		
		}
		
		

	}


