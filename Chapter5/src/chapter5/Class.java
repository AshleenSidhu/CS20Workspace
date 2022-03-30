
package chapter5;

import java.util.Scanner;

public class Class 
{
	public static void main(String[] args) 
	{
		int numVisitors;
		int totalVisitors = 0;
		int avgVisitors = 0;
		
		Scanner input = new Scanner(System.in);
		
		
		for(int day =1; day <=5; day++) 
		{
			System.out.print("Enter the number of visitors on day " + day + ": ");
			numVisitors = input.nextInt();
			totalVisitors = totalVisitors + numVisitors;
		}
		
		avgVisitors = (totalVisitors / 5);
		System.out.print("\nThe average number of visitors is " + avgVisitors);
		
		input.close();
	}
}

/* Screen Dump

Enter the number of visitors on day 1: 2
Enter the number of visitors on day 2: 1
Enter the number of visitors on day 3: 0
Enter the number of visitors on day 4: 3
Enter the number of visitors on day 5: 4

The average number of visitors is 2

*/