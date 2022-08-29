package com.tnsif.lesson3g;
import java.util.Scanner;


public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number");
		Scanner obj = new Scanner(System.in);
		Double firstNumber = obj.nextDouble();
		System.out.println("Number entered is "+firstNumber);
		
	}

}