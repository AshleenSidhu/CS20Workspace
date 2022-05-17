/*

Program: .java          Last Date of this Revision: 02-May-2022

Purpose: 

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
		int arr[] = {-6, -3, -1, 2, 4, 5};
		
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


 
*/ 
