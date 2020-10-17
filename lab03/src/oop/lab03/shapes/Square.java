package oop.lab03.shapes;

public class Square implements Poligon {
	
	private final double edge;
	
	public Square(double edge) {
		this.edge = edge;
	}
	
	public double getPerimeter() {
		return edge * 4;
	}

	public double getSquare() {
		return edge * edge;
	}
	
	public int getEdgesCount() {
		return 4;
	}

}
