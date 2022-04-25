/*

Program: Circle.java          Last Date of this Revision: 05-Mar-2022

Purpose:

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/
package chapter7GUI;

public class Circles 
{
	private static final double PI = 3.14;
	private double radius; //variables
	
	public Circles() //constructor method
	{
		radius = 1;           //default radius
	}
	
	public void setRadius(double newRadius)
	{
		radius = newRadius;
	}
	
	public double circumference()
	{
		double circleC;
		circleC = PI * radius * radius;
		return(circleC);
	}
	
	public double getRadius()
	{
		return(radius);
	}
	
	public static void main(String[] args)
	{
		Circles spot = new Circles();
		
		spot.setRadius(3);
		System.out.println("Circle radius: " + spot.getRadius);
		System.out.println("Circle Circumference: " + spot.circumference());
	}
}
