/*

Program: TimeConverter.java          Last Date of this Revision: 05-Mar-2022

Purpose: 

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/

package chapter6;

import java.util.Scanner;

public class TimeConverter 
{
	public static void hourstomin()
	{
		int hours, min;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of hours: ");
		hours = input.nextInt();
		
		min = hours * 60;
		
		System.out.print(min + " minutes in " + hours + " hours.");
		input.close();
	}
	
	public static void daystohours()
	{
		int hours, days;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of days: ");
		days = input.nextInt();
		input.close();
		
		hours = days * 24;
		
		System.out.print(hours + " hours in " + days + " days.");
	}
	
	public static void mintohours()
	{
		int hours, min;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		min = input.nextInt();
		input.close();
		
		hours = min / 60;
		
		System.out.print(hours + " hours in " + min + " minutes.");
	}

	public static void hourstodays()
	{
		int hours, days;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of hours: ");
		hours = input.nextInt();
		input.close();
		
		days = hours / 24;
		
		System.out.print(days + " days in " + hours + " hours.");
	}
	
	public static void main(String[] args)
	{
		int option;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1: hours to minutes"
				+ "\n2: days to hours "
				+ "\n3: minutes to hours "
				+ "\n4: hours to days"
				+ "\n\nEnter a number for one of the choices above: ");
		
		option = input.nextInt();
	
		if(option == 1)
		{
			hourstomin(); 
		}
		
		else if(option == 2)
		{
			daystohours(); 
		}
		
		else if(option == 3)
		{
			mintohours(); 
		}
		
		else if(option == 4)
		{
			hourstodays(); 
		}
		
		else
		{
			hourstodays(); 
		}
		
		input.close();
	}
}

/* Screen Dump 

Enter a number from below: 

1: hours to minutes
2: days to hours 
3: minutes to hours 
4: hours to days1
Enter the number of hours: 3
180 minutes in 3 hours.



1: hours to minutes
2: days to hours 
3: minutes to hours 
4: hours to days

Enter a number for one of the choices above:2
Enter the number of days: 6
144 hours in 6 days.


1: hours to minutes
2: days to hours 
3: minutes to hours 
4: hours to days

Enter a number for one of the choices above: 1
Enter the number of hours: 20
1200 minutes in 20 hours.

 */