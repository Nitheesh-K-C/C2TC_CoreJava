package com.tnsif.lesson3g;

class OneNew
{
	void dispOutput()
	{
		System.out.println("I am class One");
	}
}
class TwoNew extends OneNew
{
	void dispOutputTwo()
	{
		System.out.println("I am class Two");
	}
	
}
class Three extends Two
{
	void dispOutputThree()
	{
		System.out.println("I am class Three");
	}
}
class Four extends Three
{
	void dispOutputFour()
	{
		System.out.println("I am class Four");
	}
}

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Four obj = new Four();
		
		obj.dispOutputFour();
		obj.dispOutputThree();
		
		
	}

}