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
	private int randomNum1, randomNum2;
	private int answer;
	private int correctAnswer;
		
	public Adder()
	{
		randomNum1 = (int)(Math.random() * 10);
		randomNum2 = (int)(Math.random() * 10); 
	}
	
	public void createProblem()
	{
		Scanner input = new Scanner(System.in);
		
		correctAnswer = randomNum1 + randomNum2;
		
		System.out.print(randomNum1 + " + " + randomNum2 + " = ");
		
		answer = input.nextInt();
	
	}
	
	public void announcePoints()
	{
		boolean continueLoop = true;
		
		if(answer == correctAnswer)
		{
			System.out.println(answer == correctAnswer ? "Correct." : "Wrong.");
		}
		else 
		{
			System.out.println("Your score is: ");
			continueLoop = false;
		}
		
	}
	
	public static void main(String[] args)
	{
	
		
	}
}


	
