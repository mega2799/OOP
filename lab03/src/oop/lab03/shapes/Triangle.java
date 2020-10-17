package oop.lab03.shapes;

public class Triangle implements Poligon {
	
	private final double edge1;
	private final double edge2;
	private final double hypothenuse;
	
	
	public Triangle(double edge1, double edge2, double hypothenuse) {
		this.edge1 = edge1;
		this.edge2 = edge2;
		this.hypothenuse = hypothenuse;
	}

	public double getPerimeter() {
		// TODO Auto-generated method stub
		return edge1 + edge2 + hypothenuse;
	}

	public double getSquare() {
		double height = ( edge1 * edge2 ) / hypothenuse;
		return ( height * hypothenuse ) / 2;
	}

	public int getEdgesCount() {
		return 3;
	}

}
