package com.tnsif.lesson3g;

class Demo {
	private Integer firstNumber;
	private Integer secondNumber;
	Demo()
	{
		firstNumber = 100;
		System.out.println("Value is "+firstNumber);
	}
	Demo(Integer secondNumber)
	{
		this.secondNumber = secondNumber;
		System.out.println("Value is "+secondNumber);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj = new Demo();
		Demo obj1 = new Demo(500);
	}

}
