/* --------------PROGRAM SUBMITTED BY SHREYAS B(2015103073)--------------*/
package duplicateElimination;
import java.util.*;

public class DuplicateEliminate {

	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		int a[]=new int[5];
		int x,c=0,temp;
		for(int i=0;i<5;i++)
		{
			x=0;
			System.out.println("Enter the number:");
			temp=input.nextInt();
			if(temp>9 && temp<101)
			{
				
				for(int j=0;j<i;j++)
				{
					if(a[j]==temp)
					{
						x=1;
						break;

					}
					else
					{
						continue;
					}
					
				}
			
			
			
			
				if(x==1)
				{
					
					continue;
					
				}
				else
				{
					a[c]=temp;
					c++;
					System.out.println("The Unique Array is: ");
					for(int z=0;z<c;z++)
						System.out.println(" "+a[z]);
				}
			}	
				
		}
			
	}

}

