/*

Program: DigitsSum.java          Last Date of this Revision: 12-April-2022

Purpose: Create a DigitsSum application that prompts the user for a non-negative integer and then displays the sum of the digits.

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/
package chapter5;

import java.util.Scanner;

public class DigitsSum 
{
	public static int sumDigits(long n) 
	{
		//declare variable and value
		int result = 0;
		
		while(n > 0) //calculates the sum of digits
		{
			result += n % 10;
			n /= 10;
		}
		
		return result;
		
	}
	
	public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      
      //prompts user to enter a positive integer 
      System.out.print("Enter a positive integer: ");
      int digits = input.nextInt();
      
      //displays the sum of the numbers from the sumDigits method 
	  System.out.println("The sum of the digits is: " + sumDigits(digits));
	  input.close();
    }
	
}

/* Screen Dump 

Enter a positive integer: 42
The sum of the digits is: 6


Enter a positive integer: 892
The sum of the digits is: 19



 */