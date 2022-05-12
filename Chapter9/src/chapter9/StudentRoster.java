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
		
		for (int i = 0; i < studentNames.length; i++)
		{
			System.out.print("Enter the names of the students " + (i+1) + " in the class: ");
			studentNames[i] = input.next();
			System.out.println(studentNames[i]);
		}
		
		System.out.println("Student Roster");
		
		for (int i = 0; i < numStudents; i++)
		{
			System.out.println(studentNames[i]);
		}
		input.close();
	}
}
