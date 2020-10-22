package it.unibo.oop.lab04.robot.arms;

public class BasicArm {
	private final String name;

	public BasicArm(String name) {
		this.name = name;
	}
	
	public final boolean isGrabbing(){
		return true;
	}
}
