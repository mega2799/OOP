package it.unibo.oop.lab04.robot.arms;

import it.unibo.oop.lab04.robot.base.BaseRobot;
import it.unibo.oop.lab04.robot.base.Position2D;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms{

	public RobotWithTwoArms(String robotName) {
		super(robotName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean moveUp() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moveDown() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moveLeft() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moveRight() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getBatteryLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Position2D getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean pickUp() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean dropDown() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getItemsCarried() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
