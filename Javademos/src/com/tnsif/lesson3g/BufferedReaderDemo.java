package com.tnsif.lesson3g;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderDemo  {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
BufferedReader obj = new BufferedReader(new  InputStreamReader(System.in));
System.out.println("Enter your name");
String firstName = obj.readLine();
System.out.println(firstName);

	}

}