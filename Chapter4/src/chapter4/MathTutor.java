/*

Program: MathTutor.java          Last Date of this Revision: 06-Mar-2022

Purpose: Create a MathTutor application that displays math problems by randomly generating two numbers, 1 through 10 and an operator(*,+,-,/), and then prompts the user for an answer.

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/

package chapter4;

import java.util.Scanner;

public class MathTutor 
{
	public static void main(String[] args)
	{
		int correctAnswer, response;
		int num1, num2;
		Scanner input = new Scanner(System.in);//create object for input
		
		//Create two random numbers (1-10)
		num1 = (int)(10* Math.random()+1); 
		num2 = (int)(10* Math.random()+1);
		
		//Create a random operator (*,+,-,/) 4 symbols 
		int operator =(int)(4* Math.random()+1);
		
		if(operator == 1) //adding numbers together
		{
			correctAnswer = num1 +num2;
			
			System.out.print("What is " + num1 + " + " + num2 + "? ");
		}
		else if(operator ==2) //subtracting 
		{
			correctAnswer = num1 - num2;
			
			System.out.print("What is " + num1 + " - " + num2 + "? ");
		}
		else if(operator == 3) //multiplying 
		{
			correctAnswer = num1 * num2;
			
			System.out.print("What is " + num1 + " * " + num2 + "? ");
		}
		else //dividing 
		{
			correctAnswer = num1 / num2;
			
			System.out.print("What is " + num1 + " / " + num2 + "? ");
		}
		
		response = input.nextInt(); //user enters response to the math problem 
		input.close();
		
		if(response == correctAnswer)// displays correct answer  
		{
			System.out.println("Correct!");
		}
		else // displays wrong answer 
		{
			System.out.println("Incorrect, the answer is: " + correctAnswer);
			
		}
	}
}

/* Screen Dump 

What is 7 - 8? -1
Correct!

What is 3 + 10? 12
Incorrect, the answer is: 13

 */