package it.unibo.oop.lab04.robot.arms;

public class BasicArm {
	private static double PICK_UP_ENERGY = 0.3 ;
	private static double DROP_DOWN_ENERGY = 0.1 ;
	
	private final String name;
	private boolean carryItem;

	public BasicArm(String name) {
		this.name = name;
		this.carryItem = false;
	}
	
	public final boolean isGrabbing(){
		return this.carryItem;
	}
	
	public final void pickUp() {
		if (!carryItem) {
			this.carryItem = true;
		}
	}
	
	public final void dropDown() {
		if (carryItem) {
			this.carryItem = false;
		}
	}

	public final void setCarryItem(boolean carryItem) {
		this.carryItem = carryItem;
	}
	
	public static final double getPICK_UP_ENERGY() {
		return PICK_UP_ENERGY;
	}

	public static final double getDROP_DOWN_ENERGY() {
		return DROP_DOWN_ENERGY;
	}

	@Override
	public String toString() {
		return "BasicArm [name=" + name + "]";
	}
	
}
