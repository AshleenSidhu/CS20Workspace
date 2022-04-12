/*

Program: NumberSum.java          Last Date of this Revision: 12-April-2022

Purpose: Create a NumberSum application that prompts the user for a number and then displays the numbers 1 through the number entered, each on a separate line. 

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/
package chapter5;

import java.util.Scanner;

public class NumberSum 
{
	public static void main (String[] args) 
	{
		//declare variables and values
		int n, sum = 0, num = 0;

		Scanner input = new Scanner(System.in);
		
		//prompt user to enter a number
		System.out.print("Enter a number: ");
		n = input.nextInt();
		input.close();
		
		do //displays the number 1 through the number entered
		{
			System.out.println(num); 
			num += 1;
			sum += num; //sum is calculated
		}
		
		while(num <= n);//display the sum of the numbers  
		
		System.out.println("the sum of the numbers is: " + sum);
		
	}
}

/* Screen Dump 

Enter a number: 8
0
1
2
3
4
5
6
7
8
the sum of the numbers is: 45


Enter a number: 3
0
1
2
3
the sum of the numbers is: 10

 */