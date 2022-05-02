/*

Program: Circle.java          Last Date of this Revision: 02-May-2022

Purpose: Modify the Circle class to include a member named circumference, displayAreaFormula and to include
         an overhead constructor that accepts the radius of the Circle object.

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/
package chapter7GUI;

public class Circle 
{
	private static final double PI = 3.14; //class constant
	private double radius; //variables
	
	
	public Circle()  //constructor method
	{
		radius = 1;  //radius initialized to 1
	}
	
	
	
	public Circle(double r) //circle object created with radius r
	{
		radius = r;
	}

	
	
	public void setRadius(double newRadius) //changes the radius of the circle
	{
		radius = newRadius;
	}
	
	
	
	public double area() //calculates the area of a circle
	{
		double circleArea;
		
		circleArea = PI * radius * radius;
		
		return(circleArea);
	}
	
	
	
	public double circumference() //calculates the circumference of a circle
	{
		double circleC;
		
		circleC = (2 * radius) * PI;
		
		return(circleC);
	}
	
	
	
	public double getRadius() //returns the radius of the circle
	{
		return(radius);
	}
	
	
	public boolean equals(Object c) //c is a circle object, determines if the object is equal to another
	{
		Circle testObj = (Circle)c;
		
		if(testObj.circumference() == circumference()) //true has been returned if the objects have the same circumference
		{
			return(true);
		}
		
		else //false has been returned otherwise 
		{
			return(false);
		}
	}
	
	
	public String toString()
	{
		String circleString;
		
		circleString = "Circle circumference: " + circumference();
		
		return(circleString);
	}
	
	
	
	public static void displayCircumferenceFormula()
	{
		System.out.println("\nThe formula for the circumference of a circle is 2 * radius * Pi");
	}
	
	
	
	public static void main(String[] args)
	{
		Circle spot = new Circle();
		
		spot.setRadius(3);
		
		System.out.println("Circle radius: " + spot.getRadius());
		
		System.out.println("Circle Circumference: " + spot.circumference());
	}
	
}
