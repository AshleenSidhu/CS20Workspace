/*

Program: Printing.java          Last Date of this Revision: 06-Mar-2022

Purpose: Create a Printing application that prompts the user for the number of copies to print and then displays the price per copy and the total price for the job.

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/

package chapter4;

import java.util.Scanner;

public class Printing 
{
	public static void main(String[] args)
	{
		int numCopies;
		double cost;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of copies to be printed: ");//user enters number of copies 
		numCopies = input.nextInt();
		input.close();
		
		if(numCopies>=1000) //number of copies over 1000
		{
			System.out.println("Price per copy is: $0.25"); 
			cost = numCopies*0.25;
			System.out.print("Total cost is: $" + cost);
		}	
		
		else if(numCopies>=750) //number of copies 750-1000
		{
			System.out.println("Price per copy is: $0.26");
			cost = numCopies *0.26;
			System.out.print("Total cost is: $" + cost);
		}
		
		else if(numCopies>=500) //number of copies 500-749
		{
			System.out.println("Price per copy is: $0.27");
			cost = numCopies *0.27;
			System.out.print("Total cost is: $" + cost);
		}
		
		else if(numCopies>=100) //number of copies 100-499
		{
			System.out.println("Price per copy is: $0.28");
			cost = numCopies *0.28;
			System.out.print("Total cost is: $" + cost);
		}
		
		else if(numCopies>=1) //number of copies 0-99
		{
			System.out.println("Price per copy is: $0.30");
			cost = numCopies *0.30;
			System.out.print("Total cost is: $" + cost);
		}
		
		else //user does not enter a number  
		{
			System.out.println("Error invalid answer.");
		}
		
	}
}

/* Screen Dump 

Enter the number of copies to be printed: 1001
Price per copy is: $0.25
Total cost is: $250.25

 */