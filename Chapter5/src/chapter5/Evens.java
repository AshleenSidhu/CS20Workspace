/*

Program: Evens.java          Last Date of this Revision: 12-April-2022

Purpose: Create an evens application that displays the even numbers between 1 and 20, inclusive. 

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/

package chapter5;

public class Evens 
{
	public static void main (String[] args)
	{
		//declare variables
		int num = 0;
		
		while(num <= 19)//number can only go up to 20
		{
			num += 2; // 2 is added every time to number 
			System.out.println(num); // display even numbers
		}
		
	}
}

/* Screen Dump 

2
4
6
8
10
12
14
16
18
20


 */

