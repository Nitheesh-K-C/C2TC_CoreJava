// program to demostrate usage of source command in eclipse
package com.tnsif.lesson3g;

class CarOne {
	private String carName ;
	private Integer topSpeed;
	
	public CarOne(String carName, Integer topSpeed) {
		this.carName = carName;
		this.topSpeed = topSpeed;
		System.out.println("Car name is "+carName);
		System.out.println("Top speed is "+topSpeed);
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Integer getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(Integer topSpeed) {
		this.topSpeed = topSpeed;
	}	
	
}
public class SmartCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarOne obj = new CarOne("Seltos",100);
	}

}