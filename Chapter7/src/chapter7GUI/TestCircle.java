/*

Program: TestCircle.java          Last Date of this Revision: 02-May-2022

Purpose: Modify the Circle class to override the equal() and toString() methods and modify the existing client code
         to test the new methods.

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/
package chapter7GUI;

public class TestCircle 
{
	public static void main(String[] args)
	{
		Circle spot = new Circle(5);
		
		Circle box1 = new Circle(3);
		
		Circle box2 = new Circle(4);
		
		
		System.out.println("Circle radius: " + spot.getRadius());
		
		System.out.println("Circle circumference: " + spot.circumference());
		
		Circle.displayCircumferenceFormula();
		
		
		System.out.println("\nCircle radius: " + box1.getRadius());
		
		System.out.println("Circle radius: " + box2.getRadius());
		
		
		if (box1.equals(box2))
		{
			System.out.println("Objects are equal.");
		}
		
		else
		{
			System.out.println("Objects are not equal.");
		}
		
		System.out.println(box1 + " for the radius of 3.0");
		
		System.out.println(box2 + " for the radius of 4.0");
		
	}
}
