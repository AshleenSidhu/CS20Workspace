/*

Program: RectanglePerimeter.java          Last Date of this Revision: 03-Mar-2022

Purpose: Create a RectanglePerimeter application that calculates t=and displays the perimeter of a rectangle with width 4 and length 13. 

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/

package chapter3;

public class RectanglePerimeter
{
	 public static void main(String[] args) 
	 {
		 int length = 13;
		 int width = 4;
		 int perimeter;
	 
		 perimeter = 2*(length + width);
	 
		 System.out.print("Perimeter of rectangle: " + perimeter);
	 
	 }
}

/* Screen Dump

Perimeter of rectangle: 34

*/