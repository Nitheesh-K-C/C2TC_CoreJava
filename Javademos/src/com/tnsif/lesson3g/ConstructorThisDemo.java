package com.tnsif.lesson3g;

class Car {
	private String doors;
	private Integer speed;
	public Car(String doors, Integer speed) {

		this.doors = doors;
		this.speed = speed;
	}
	public Car() {
	}
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
}

public class ConstructorThisDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}