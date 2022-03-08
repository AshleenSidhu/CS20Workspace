/*

Program: SurfsUp.java          Last Date of this Revision: 05-Mar-2022

Purpose: Create a SurfsUp application to display "Great day for surfing!" When the waves are 6 feet or over, 
         "Go body boarding!" when the waves are between 3 and 6 feet, "Go for a swim." when the waves are from 0 to 3 feet, 
         and "Woah! what kind of surf is that?" otherwise.

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/

package chapter4;

import java.util.Scanner;

public class SurfsUp 
{
	public static void main(String[] args)
	{
		int height;
		Scanner input = new Scanner(System.in);
		
		//prompts user to enter wave height
		System.out.print("Enter wave height: ");
		height = input.nextInt();
		input.close();
		
		if(height>=6)//the given wave height is above 6 feet
		{
			System.out.println("Great day for surfing!");
		}	
		
		else if(height>=3)//wave height is 3-6 feet
		{
			System.out.println("Go body boarding!");
		}
		
		else if(height>=0) //wave height is 0-3 feet
		{
			System.out.println("Go for a swim.");
		}
		
		else //otherwise 
		{
			System.out.println("Woah! What kind of surf is that?");
		}
		
	}
	
	
}

/* Screen Dump 

Enter wave height: 6
Great day for surfing!

Enter wave height: 4
Go body boarding!

Enter wave height: 2
Go for a swim.

Enter wave height: -1
Woah! What kind of surf is that?


 */