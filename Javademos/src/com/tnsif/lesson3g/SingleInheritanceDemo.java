// program to demonstrate Inheritance - Single, Multi-level, Hierarchical)
package com.tnsif.lesson3g;
// Parent class
 class One
{
	 Integer FIRSTNUMBER = 100;
	void dispOutput1(Integer firstNumber)
	{
		this.FIRSTNUMBER = firstNumber;
		System.out.println("I am class One");
	}
 void dispOutput2()
	{
		System.out.println("I am class Two");
	}
}
// Child class
class Two extends One
{
	void dispOutput2()
	{
		System.out.println("I am class Three");
	}
}
public class SingleInheritanceDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two obj2 = new Two();
		
	}

}