// program to demonstrate import package.*;
package com.tnsif.lesson3d;
import com.tnsif.lesson3b.*;
import com.tnsif.lesson3c.*;
import com.tnsif.lesson3a.One;
public class Four {
	void dispOutput()
	{
		System.out.println("I am Four");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Two obj = new Two();	
		obj.dispOutput();
		Three obj1 = new Three();
		obj1.dispOutput();
		One obj2 = new One();
		obj2.dispOutput();
	}

}
