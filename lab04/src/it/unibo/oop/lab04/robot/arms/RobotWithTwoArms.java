package it.unibo.oop.lab04.robot.arms;

import it.unibo.oop.lab04.robot.base.BaseRobot;
import it.unibo.oop.lab04.robot.base.Position2D;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms{
	
    public static final double MOVEMENT_DELTA_CONSUMPTION_CARRY = 0.5;
	private int itemsCarried;
	
	public final BasicArm[] arms  = new BasicArm[] {
			new BasicArm("Right Arm"),
			new BasicArm("Left Arm")
	};
	
	public RobotWithTwoArms(String robotName) {
		super(robotName);
		this.itemsCarried = itemsCarried;
	}
	
	public boolean pickUp() {
		for(BasicArm b : arms) {
			if (!b.isGrabbing() && isBatteryEnough(b.getPICK_UP_ENERGY())) { // if is not grabbing then 
				b.pickUp();
				this.itemsCarried++;
				consumeBattery(b.getPICK_UP_ENERGY());
				log(b + " is picking an object");
				return b.isGrabbing();
			}
			log("Can not grab (battery=" + this.getBatteryLevel() + "," + b + " isGrabbing=" + b.isGrabbing() + ")");
		}
		
		return false;
	}

	public boolean dropDown() {
		for(BasicArm b : arms) {
			if (b.isGrabbing() && isBatteryEnough(b.getDROP_DOWN_ENERGY())) {
				b.dropDown();
				this.itemsCarried--;
				consumeBattery(b.getDROP_DOWN_ENERGY());
				log(b + " is dropping an object");
				return b.isGrabbing();
			}
			log("Can not drop (battery=" + this.getBatteryLevel() + "," + b + " isGrabbing=" + b.isGrabbing() + ")");
		}
		return false;
	}

	public int getItemsCarried() {
		return this.itemsCarried;
	}
	
	protected double getBatteryRequirementForMovement() {
       return super.getBatteryRequirementForMovement() + MOVEMENT_DELTA_CONSUMPTION_CARRY ;
    }
	
	
}
