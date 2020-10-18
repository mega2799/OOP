package oop.lab03.shapes;

public class Rectangle implements Poligon {
	
	static final int N_EDGES = 4;

	private final double base;
	private final double height;
	
	

	public Rectangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getPerimeter() {
		return base * 2 + height * 2;
	}

	public double getSquare() {
		return base * height;
	}

	public int getEdgesCount() {
		return N_EDGES;
	}

}
