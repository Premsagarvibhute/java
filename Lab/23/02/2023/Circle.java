package com.cognizant.shapes;// declares a package com.cognizant.shapes for this class

public class Circle {// defines a class containing main()

	private float radius;// declare and defines a private instance variable radius of type float
	float pi;// declare and defines an instance variable pi of type float

	private Circle()// defines a private default Constructor
	{
		radius = 1.5f;// sets the value of private instance variable radius = 1.5
	}

	Circle(float radius)// defines a parameterized Constructor with one parameter radius
	{
//		 this.radius=radius;//sets the value of radius to the value passed as parameter
//		 pi=3.5f;//sets the value of pi to 3.5
		this(radius, 3.5f);// short hand to set the value of radius to passed value and pi to 3.5

	}

	private Circle(float radius, float pi)// defines a private parameterized Constructor with 2 float parameters radius
											// and pi
	{
		this.pi = pi;// sets the value of instance variable pi to passed value
		this.radius = radius;// sets the value of private instance variable radius to passed value
	}

	float calculateCircleArea(float radius)// defines a method calculateCircleArea with a float parameter radius to
											// calculate the area of a circle
	{
		return pi * radius * radius;// returns the area of circle
	}

	float calculateCircumference(float pi)// defines a method calculateCircumference with a float parameter pi to
											// calculate the circumference of a circle
	{
		return 2 * pi * radius;// returns the circumference of a circle
	}

	public static void main(String[] args) {// defines the main()
		// create an instance of class Circle using parameterized constructor with
		// radius
		Circle c = new Circle(5);// sets the value of radius to 5

		System.out.println("Area of Circle : " + c.calculateCircleArea(5));// prints the value of Area of Circle
		System.out.println("Circumference of Circle : " + c.calculateCircumference(3.14f));// prints the value of
																							// Circumference of Circle
	}
}