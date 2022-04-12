/*

Program: GuessingGame.java          Last Date of this Revision: 12-April-2022

Purpose: 

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/
package chapter5;

import java.util.Scanner;

import java.util.Random;

public class GuessingGame 
{
	public static void main(String[] args)
	{ 
	    int secretNum;
	    int guess;
	    
	    //Generate numbers 1-20
	    secretNum = (int)(Math.random() * 20 + 1);
	    
	    Scanner input = new Scanner(System.in);
	    
	    do 
	    {
	    //prompt user to enter a number	
	    System.out.print("Enter a number between 1 and 20: ");
	    guess = input.nextInt();
	    
	    if (guess == secretNum) //user guesses number
	    {
	    	System.out.print("You guessed it! You won!");
	    }
	    
	    else if (guess < secretNum)
	    {
	    	System.out.println("Too low");
	    	System.out.println("Try again");
	    }
	    
	    else if (guess > secretNum) 
	    {
	    	System.out.println("Too high");
	    	System.out.println("Try again");
	    }
	    
	    }

	    while (guess != secretNum); //checks if the guess is equal or not to secretNum
	    
	}

}

/* Screen Dump 

Enter a number between 1 and 20: 12
Too low
Try again
Enter a number between 1 and 20: 16
Too low
Try again
Enter a number between 1 and 20: 18
Too low
Try again
Enter a number between 1 and 20: 19
You guessed it! You won!


 */