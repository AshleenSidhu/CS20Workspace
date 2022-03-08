/*

Program: Digits.java          Last Date of this Revision: 05-Mar-2022

Purpose: Create a digits application that prompts the user for a two-digit number and then displays the ones-place and tens-place digits.

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/

package chapter3;

import java.util.Scanner;

public class Digits 
{
	public static void main(String[] args)
	{
		int number, ten, one;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a two-digit number: ");
		
		number = input.nextInt();
		input.close();
		
		ten = number / 10;
		one = number % 10;
		
		System.out.println("The tens-place is: " + ten);
		
		System.out.println("The ones-place is: " + one);
		
	}
}

/* Screen Dump 

Enter a two-digit number: 12
The tens-place is: 1
The ones-place is: 2

 */