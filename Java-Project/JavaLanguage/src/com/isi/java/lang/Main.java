package com.isi.java.lang;

import java.util.Random;

public class Main
{
	private static Random random = new Random(System.currentTimeMillis());
	
	private static int[] nextRandomIntArray(int length)
	{
		int[] intArray = new int[length];
		for (int i = 0; i < intArray.length; i++)
			intArray[i] = random.nextInt(1000);
		return intArray;
	}
	
	// Main method
	public static void main(String[] args)
	{
		System.out.println("main(): Main method starting ...");
		new Variables(100, 123.987f, "Final string");
		new ControlStructures(true, false);
	}
}
