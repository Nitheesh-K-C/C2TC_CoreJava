package com.tnsif.lessoninterface;

public class Cow implements Animal{

	@Override
	public void eat() {
		System.out.println("Cow eats grass, its a herbivorous animal");
		
	}

	@Override
	public void makesSound() {
		System.out.println("Cow make Mow Mow sound");
	}

}