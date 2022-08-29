package com.tnsif.lesson3g;

class Operation {
	
	void addNumber()
	{
		System.out.println("I am doing nothing");
	}
	Integer addNumber(Integer firstNumber, Integer secondNumber)
	{
		return firstNumber+secondNumber;
	}	
	Double addNumber(Double firstNumber, Integer secondNumber, Float thirdNumber)
	{
		return firstNumber+secondNumber+thirdNumber;
	}
}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation obj = new Operation();
		obj.addNumber();
		System.out.println(obj.addNumber(10, 20));
		System.out.println(obj.addNumber(30.00, 10, 432.1f));
	}

}