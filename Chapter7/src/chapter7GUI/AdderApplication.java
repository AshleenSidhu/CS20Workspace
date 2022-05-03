/*

Program: .java          Last Date of this Revision: 02-May-2022

Purpose: 

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/
package chapter7GUI;

import java.util.Scanner;

public class AdderApplication 
{
	public static final double Num = Math.random();
	private int compNum;
	private double playerGuess;
	
	//constructor
	public AdderApplication()
	{
		compNum = (int)(Math.random() * 20 + 0);
	   
		playerGuess = 0;
	}
	
	public void setAnswer(double newAnswer)
	{
		playerGuess = newAnswer;
	}
	
	public double additionProblem()
	{
		double gameNum;
		
		gameNum = Num;
		
		return(gameNum);
	}
	
	public double getAnswer()
	{
		return(playerGuess);
	}
	
	public boolean equals(Object g) //g is a AdderApplication object, determines if the object is equal to another
	{
		AdderApplication testObj = (AdderApplication)g;
		
		if(testObj.additionProblem() == additionProblem()) //true has been returned if the objects have the same answer
		{
			return(true);
		}
		
		else //false has been returned otherwise 
		{
			return(false);
		}
	}
	
	public static void playGame()
	{
		System.out.println("");
	}
	
	
}
