package oop.lab03.shapes;

public class Square implements Poligon {
	
	static final int N_EDGES = 4;

	private final double edge;
	
	public Square(double edge) {
		this.edge = edge;
	}
	
	public double getPerimeter() {
		return edge * N_EDGES;
	}

	public double getSquare() {
		return edge * edge;
	}
	
	public int getEdgesCount() {
		return N_EDGES;
	}

}
