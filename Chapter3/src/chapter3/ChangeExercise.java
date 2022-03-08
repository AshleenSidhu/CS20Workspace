/*

Program: ChangeExercise.java          Last Date of this Revision: 05-Mar-2022

Purpose: Create a change application that prompts the user for an less than $1.00 and then displays the minimum number of coins necessary to make the change.

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/

package chapter3;

import java.util.Scanner;

public class ChangeExercise 
{
	public static void main(String[] args)
	{
		System.out.print("Enter the change in cents: ");
		
		int quarters, dimes, nickels, pennies, amount;
		
		Scanner input = new Scanner(System.in);
		amount = input.nextInt();
		input.close();
		
		quarters = amount / 25;
		amount = amount % 25;
		
		dimes = amount / 10;
		amount = amount % 10;
		
		nickels = amount / 5;
		amount= amount % 5;
		
		pennies = amount;
		
		System.out.println("The minimum number of coins is: ");
		
		System.out.println("Quarters: " + quarters);
		
		System.out.println("Dimes: " + dimes);
		
		System.out.println("Nickels: " + nickels);
		
		System.out.println("Pennies: " + pennies);
		
	}
}

/* Screen Dump 

Enter the change in cents: 212
The minimum number of coins is: 
Quarters: 8
Dimes: 1
Nickels: 0
Pennies: 2

*/
 