// program to demostrate static block
package com.tnsif.lesson2;

public class StaticBlockDemo {
	/* this is static block, this executes before main()*/
	static {
		System.out.println(" static block");
	}
	/* this line executes 2nd */
	void displayOutput()
	{
		System.out.println("line one");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlockDemo obj = new StaticBlockDemo();
		obj.displayOutput();
		/* this line executes last*/
		System.out.println("line two");
	}
	

}

