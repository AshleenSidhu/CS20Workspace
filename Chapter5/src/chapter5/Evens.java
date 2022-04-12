/*

Program: Evens.java          Last Date of this Revision: 06-Mar-2022

Purpose: Create an evens application that displays the even numbers between 1 and 20, inclusive. 

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/

package chapter5;

import java.util.Scanner;

public class Evens 
{
	public static void main(String[] args)
	{
		int num = 0;
		int even = 2;
		
		Scanner input = new Scanner(System.in);
		
		while(num != even) 
		{
			System.out.println("Enter a starting number");
			num = input.nextInt();
			input.close();
			
			if(num>=even)
			{
				System.out.println("Display even numbers: " + num);
			}
		}
	}
		
}

/* Screen Dump 



 */

