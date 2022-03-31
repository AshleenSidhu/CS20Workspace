package chapter7;

public class Circle 
{
	public static void circumference(int Circle)
	{
		
	}
	
	public static void main(String[] args)
	{
		Circle spot = new Circle();
		
		spot.setRadius(3);
		System.out.print("Circle radius: " + spot.getRadius());
		System.out.print("Circle circumference:: " + spot.circumference());
	}
}
