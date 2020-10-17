package oop.lab03.shapes;


public class Circle implements Shape {
	
	private final double radius;
	
	private static  double PI = java.lang.Math.PI;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getPerimeter() {
		return  PI * 2 * radius;
	}

	public double getSquare() {
		return PI * ( radius * radius ) ;
	}

	public double getRadius() {
		return radius;
	}
}
