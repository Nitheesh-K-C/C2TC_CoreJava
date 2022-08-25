// program on static variable
package com.tnsif.lesson2;
class Demo
{
	Integer firstNumber = 100;
	Demo()
	{
		firstNumber++;
		System.out.println("Number is "+firstNumber);
	}
	Demo(int x)
	{
		Integer sideValue=x;
		firstNumber--;
		System.out.println("Number is "+firstNumber);
		System.out.println("Side is "+sideValue);
	}
}
public class StaticVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj = new Demo();
		Demo obj1 = new Demo(5);
	}

}
