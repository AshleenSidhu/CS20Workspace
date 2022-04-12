/*

Program: AccountSetup.java          Last Date of this Revision: 12-April-2022

Purpose: Create an AccountSetup application that prompts the user for a user for a user name and a password. 

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/
package chapter5;

import java.util.Scanner;

public class AccountSetup 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int passLength;
		String password, username;
		
		//prompt user to enter a user name
		System.out.print("Enter a user name: ");
		username = input.next();
		
		//prompt user to enter a password
		System.out.print("Enter a password that is at least 8 characters: ");
		password = input.next();
		passLength = password.length();
		
		//if the password length is 8 characters then continue, if not then try again
		while(passLength < 8)
		{
			System.out.print("Enter a password that is at least 8 characters: ");
			password = input.next();
			passLength = password.length();
		}
		
		input.close();
		
		//display user name and password
		System.out.print("Your user name is " + username.toLowerCase() + " and your password is " + password.toLowerCase());
	
		
	}
}

/* Screen Dump 

Enter a user name: MattD
Enter a password that is at least 8 characters: Programmer7
Your user name is mattd and your password is programmer7


Enter a user name: PotsPans
Enter a password that is at least 8 characters: nope
Enter a password that is at least 8 characters: pass123
Enter a password that is at least 8 characters: Password123
Your user name is potspans and your password is password123

*/