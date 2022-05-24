/*

Program: .java          Last Date of this Revision: 02-May-2022

Purpose: 

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/
package chapter7GUI;

import java.util.Scanner;

public class Adder 
{
	public int wrongAnswer;
	
	public Adder(int w)
	{
		w = wrongAnswer;
	}
	
	public static void countPoints()
	{
		Scanner input = new Scanner(System.in);
		
		if(answer = correctAnswer )
		{
			System.out.println("Correct");
			
		}
	}
	
	public static void main(String[] args)
	{
		int randomNum1, randomNum2;
		int answer;
		int correctAnswer;
		
		boolean continueLoop = true;
		
		Scanner input = new Scanner(System.in);
		
		while(continueLoop)
		{
			randomNum1 = (int)(Math.random() * 10);
			randomNum2 = (int)(Math.random() * 10);
			
			correctAnswer = randomNum1 + randomNum2;
			
			System.out.print(randomNum1 + " + " + randomNum2 + " = ");
			
			answer = input.nextInt();
			
			if(answer != -1)
			{
				System.out.println(answer == correctAnswer ? "Correct." : "Wrong.");
			}
			
			else 
			{
				System.out.println("Your score is: ");
				continueLoop = false;
			}
	
		}
	}
}


	
