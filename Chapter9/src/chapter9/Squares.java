/*

Program: Squares.java          Last Date of this Revision: 09-June-2022

Purpose: Create a Squares application that stores the square of an element's index in an integer array of 5 elements.

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/
package chapter9;

import java.util.Arrays;

public class Squares 
{
	public static void sortSquares(int arr[])
	{
		int num = arr.length;
		
		for (int i = 0; i < num; i++)
		{
			arr[i] = arr[i] * arr[i];
			Arrays.sort(arr);
		}
	}
	
	public static void main(String[] args)
	{
		int arr[] = {1, 2, 3 ,4 ,5};
		
		int num = arr.length;
		
		for (int i = 0; i < num; i++)
		{
			System.out.println(arr[i] + " ");
		}
		
		sortSquares(arr);
		
		System.out.println(" ");
		
		System.out.println("After sort: ");
		
		for (int i = 0; i < num; i++)
		{
			System.out.println(arr[i] + " ");
		}
		
	}

}

/* Screen Dump 

-6, -3, -1, 2, 4, 5


-6 
-3 
-1 
2 
4 
5 
 
After sort: 
-3 
1 
4 
5 
36 
65536 


1 
2 
3 
4 
5 
 
After sort: 
1 
3 
4 
16 
625 
 
*/ 
