/*

Program: AddCoins.java          Last Date of this Revision: 12-April-2022

Purpose: Create an AddCoins application that prompts the user for the number of pennies, nickels, dimes, and quarters, and then displays their total dollar amount.

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/
package chapter6;

import java.util.Scanner;

public class AddCoins 
{
	public static String getDollarAmount(int pennies, int nickels, int dimes, int quarters)
	{
		//values are assigned 
		double totalDollars;
		nickels = nickels * 5;
		dimes = dimes * 10;
		quarters = quarters * 25;
		
		//total dollar amount is calculated
		totalDollars = pennies + nickels + dimes + quarters;
		totalDollars = totalDollars / 100;
		
		//total dollar amount is displayed
		System.out.print("\nTotal: $" + totalDollars);
		return null;
		
	}
	
	public static void main(String[] args)
	{
		//variables declared 
		int pennie, nickel, dime, quarter;
		
		Scanner input = new Scanner(System.in);
		
		//prompts user to enter numbers of coins 
		System.out.print("Enter your total coins: ");
		
		//variables values 
		System.out.print("\n\nQuarters: ");
		quarter = input.nextInt();
		
		System.out.print("Dimes: ");
		dime = input.nextInt();
		
		System.out.print("Nickels: ");
		nickel = input.nextInt();
		
		System.out.print("Pennies: ");
		pennie = input.nextInt();
		input.close();
		
		//sends the assigned values to the getDollarAmount() method 
		getDollarAmount(pennie, nickel, dime, quarter);
		
	}
}

/* Screen Dump 

Enter your total coins: 
Quarters: 3
Dimes: 2
Nickels: 1
Pennies: 8
Total: $1.08


Enter your total coins: 

Quarters: 3
Dimes: 2
Nickels: 1
Pennies: 8

Total: $1.08

 */