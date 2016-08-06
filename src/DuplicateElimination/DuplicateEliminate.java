package DuplicateElimination;

import java.util.*;

public class DuplicateEliminate {

	public static void main(String[] args) {
		int a[]=new int[5];
		int b=0,c;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the number : ");
			c=sc.nextInt();
			for(int j=0;j<i;j++)
			{
				if(a[j]==c)
				{
					b=1;
				}
				
				else
				{
					continue;
				}
			}
			if(b > 0)
			{
				continue;
			}
			else
			{
				a[i]=c;
				System.out.println(c);
			}
		}

	}

}
