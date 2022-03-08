/*

Program: Grade.java          Last Date of this Revision: 06-Mar-2022

Purpose: Create a Grade application that prompts the user for th percentage earned on test or other graded work and then displays the corresponding letter grade. 

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/

package chapter4;

import java.util.Scanner;

public class Grade 
{
	public static void main(String[] args)
	{
		int per;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the percentage: ");//user enters grade percentage
		per = input.nextInt();
		input.close();
		
		if(per>=90) //grade is 90-100
		{
			System.out.println("The corresponding letter grade is: A");
		}
		else if(per>=80) //grade is 80-89
		{
			System.out.println("The corresponding letter grade is: B");
		}
		else if(per>=70) //grade is 70-79
		{
			System.out.println("The corresponding letter grade is: C");
		}
		else if(per>=60) //grade is 60-69
		{
			System.out.println("The corresponding letter grade is: D");
		}
		else if(per<=60) //grade is below 60
		{
			System.out.println("The corresponding letter grade is: F");
		}
	}
}

/* Screen Dump 

Enter the percentage: 75
The corresponding letter grade is: C

Enter the percentage: 82
The corresponding letter grade is: B

Enter the percentage: 50
The corresponding letter grade is: F

Enter the percentage: 90
The corresponding letter grade is: A

Enter the percentage: 65
The corresponding letter grade is: D

 */
