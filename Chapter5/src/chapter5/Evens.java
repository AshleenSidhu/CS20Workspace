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
		int num;
		
		Scanner input = new Scanner(System.in);
		
		for(num =1; num <=20; num++) 
		{
			System.out.print("Enter a number: ");
			num = input.nextInt();
			input.close();
		}
		
	}
}
