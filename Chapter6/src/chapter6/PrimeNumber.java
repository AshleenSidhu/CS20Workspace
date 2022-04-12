/*

Program: TimeConverter.java          Last Date of this Revision: 05-Mar-2022

Purpose: Create a TimeConverter application that allows the user to choose among converting hours to minutes, days to hours, minutes to hours, or hours to days. 

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/
package chapter6;

import java.util.Scanner;

public class PrimeNumber 
{
	public static boolean isPrime(int num)
	{
		//if the number the user entered is less than or equaled to 1 then it returned false because it is not even
		if(num <= 1)
		{
			return false;
		}
		
		//2 is a prime number 
		//if 2 is less than or equaled to it's squared root of the number the user entered
		for(int i = 2; i <= Math.sqrt(num); i++)
		{
			if(num % i == 0)//not divisible by 2 then its not a prime number 
			{
				return false;
			}
		}
		//if it is divisible by 2 then its true and a prime number
			return true;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//prompt the user to enter a number
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		input.close();
		
		if(isPrime(num))//if the users number return true and is divisible by 2, it will display the number as a prime number
		{
			System.out.print("The number " + num + " is a prime number.");
		}
		
		else // if returned false it is not a primary number
		{
			System.out.print("The number " + num + " is not a prime number.");
		}
		
	}
}

/* Screen Dump 

Enter a number: 2
The number 2 is a prime number.


Enter a number: 8
The number 8 is not a prime number.

 */