package Commission;
import java.util.*;
public class SalesCommission {
	public static void main(String args[]) {
//input		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total Number of Employees : ");
		int n=sc.nextInt();
		
		int sales[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter sales of employee "+(i+1)+" : ");
			sales[i]=sc.nextInt();
			sales[i]=200+(sales[i]*9)/100;
		}
		
		int tab[]=new int[9];
		
		for(int i=0;i<n;i++)
		{
			if(sales[i]<300)
			{
				tab[0]++;
			}
			
			else if(sales[i]<400)
			{	
				tab[1]++;
			}
			
			else if(sales[i]<500)
			{	
				tab[2]++;
			}
			
			else if(sales[i]<600)
			{	
				tab[3]++;
			}
			
			else if(sales[i]<700)
			{	
				tab[4]++;
			}
			
			else if(sales[i]<800)
			{	
				tab[5]++;
			}
			
			else if(sales[i]<900)
			{	
				tab[6]++;
			}
			
			else if(sales[i]<1000)
			{	
				tab[7]++;
			}
			
			else
			{	
				tab[8]++;
			}
		}
		
		System.out.println("Commission Range                               Number of Salesman");
		
		System.out.println("   $200-299                                    "+tab[0] );
		System.out.println("   $300-399                                    "+tab[1] );
		System.out.println("   $400-499                                    "+tab[2] );
		System.out.println("   $500-599                                    "+tab[3] );
		System.out.println("   $600-699                                    "+tab[4] );
		System.out.println("   $700-799                                    "+tab[5] );
		System.out.println("   $800-899                                    "+tab[6] );
		System.out.println("   $900-999                                    "+tab[7] );
		System.out.println("   Greater than $1000                          "+tab[8] );
	
	
	
	
	
	
	
	}

}
