/*

Program: DigitsExercise.java          Last Date of this Revision: 05-Mar-2022

Purpose: Modify the Digits application created in a review earlier in this chapter to show the hundreds-place digit of a three digit number.

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/

package chapter3;

import java.util.Scanner;

public class DigitsExercise 
{
	public static void main(String[] args)
	{
		int number, hundred, ten, one;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit number: ");
		
		number = input.nextInt();
		input.close();
		
		hundred = (number / 100) % 10;
		ten = (number / 10)% 10;
		one = (number / 1) % 10;
		
		System.out.println("The hundreds-place digit is: " + hundred);
		
		System.out.println("The tens-place digit is: " + ten);
		
		System.out.println("The ones-place digit is: " + one);
		
	}
}

/* Screen Dump 

Enter a three-digit number: 256
The hundreds-place digit is: 2
The tens-place digit is: 5
The ones-place digit is: 6

 */
