/*

Program: OddSum.java          Last Date of this Revision: 12-April-2022

Purpose: Create an OddsSum application that prompts the user for a number then sums the odd numbers from 1 ton the number entered.

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/
package chapter5;

import java.util.Scanner;

public class OddSum 
{
	public static void main (String[] args) 
	{
		int n, num = 1, odd = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		n = input.nextInt();
		input.close();
		
		do
		{
			System.out.println(num);
			num+=2;
			odd+=num;
		}
		
		while(num<n);
		
		System.out.print("The sum of the odd numbers is: " + odd);
		
	}
}

/* Screen Dump 

Enter a number: 10
1
3
5
7
9
The sum of the odd numbers is: 35


Enter a number: 6
1
3
5
The sum of the odd numbers is: 15

 */