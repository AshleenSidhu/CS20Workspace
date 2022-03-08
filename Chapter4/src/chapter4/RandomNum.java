/*

Program: RandomNum.java          Last Date of this Revision: 05-Mar-2022

Purpose: Create a RandomNum application that prompts the user for two numbers.

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/

package chapter4;

import java.util.Random;
import java.util.Scanner;

public class RandomNum 
{
	public static void main(String[] args)
	{
		int min, max, random;
		Scanner input = new Scanner(System.in);
		Random num = new Random();
		
		System.out.print("Enter a minimum number: ");//user enters min number
		min = input.nextInt();
		
		System.out.print("\nEnter a maximum number: ");//user enters max number
		max = input.nextInt();
		
		input.close();
		
		random = num.nextInt(max)+min;//generates num given in range
		
		System.out.println("\nNumber is: " + random);//displays number to user
		
	}
}

/* Screen Dump 

Enter a min number: 10

Enter a max number: 50

Number is: 32


Enter a minimum number: 50

Enter a maximum number: 90

Number is: 61


 */
