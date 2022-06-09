/*

Program: StudentRoster.java          Last Date of this Revision: 09-June-2022

Purpose: Create a StudentRoster application that prompts the user for the number of students in the 
         class and then prompts the user for each students name and stores the names in an array.

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/
package chapter9;

import java.util.Scanner;

public class StudentRoster 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int numStudents;
		
		String[] studentNames;
		
		System.out.print("Enter the amount of students in the class: ");
		numStudents = input.nextInt();
		studentNames = new String[numStudents];
		
		//generate numbers and store them
		for (int i = 0; i < studentNames.length; i++)
		{
			System.out.print("Enter the name of student " + (i+1) + " in the class: ");
			studentNames[i] = input.next();
		}
		
		System.out.println("\nStudent Roster");
		
		//Displays the array
		for (int i = 0; i < numStudents; i++)
		{
			System.out.println(studentNames[i]);
		}
		
		input.close();
		
	}
}


/* Screen Dump 

Enter the amount of students in the class: 2
Enter the name of student 1 in the class: name
Enter the name of student 2 in the class: name2

Student Roster
name
name2
 
*/ 
