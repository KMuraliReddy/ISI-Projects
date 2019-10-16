package com.isi.java.lang;

import java.text.DecimalFormat;

public class ControlStructures
{
	private boolean a;
	private boolean b;
	private int x;
	private int y;
	
	public ControlStructures(boolean a, boolean b)
	{
		this.a = a;
		this.b = b;
		
		forLoops();
	}
	
	private void ifStatements()
	{
		if (a && b)
			x = 1;
		
		
		if (!a)
			x = 3;
		else if (b)
		{
			if (x > 4)
				y = 5;
			else
				x = 4;
		}
		else
		{
			x = 9;
			y = 12;
		}
		
		
		//// TERNARY OPERATOR
		
		x = (a) ? 25 : -1;
		// You can read this as follows:
		// x = if (a)
		// 		? then 25
		// 		: else -1
		
		//// Equivalent:
		if (a)
			x = 25;
		else
			x = -1;
		
		
		System.out.println((a) ? "Hello" : "Goodbye");
		
		//// Equivalent:
		if (a)
			System.out.println("Hello");
		else
			System.out.println("Goodbye");
	}
	
	private void switchStatements(WeekdayEnum weekday)
	{
		int myInt = x;
		
		switch (myInt)
		{
		case 0:
			// do something A
			break;
		case 1:
			// do something B
		case 2:
		case 3:
		case 4:
			// do something C
			break;
		default:
			// do something D
			break;
		}
		// case 0:	A
		// case 1:	B, C
		// case 2:	C
		// case 3:	C
		// case 4:	C
		// default:	D
		
	switchStatement:	// Label
		switch (weekday)
		{
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
			// do something
			break switchStatement;	// Break from labeled structure
		case SATURDAY:
			// do something
			break switchStatement;
		case SUNDAY:
			// do something
			break switchStatement;
		}
	}
	
	private void whileLoops()
	{
		//// WHILE loop
		
		while (a || b)
		{
			if (a)
				break;			// Break from innermost loop/switch
			else
				continue;		// Break from innermost loop/switch
		}
		
	whileLoop:		// Label
		while (a)
		{
			while (b)
			{
				// do something
				if (!a)
					break whileLoop;	// Break from labeled loop/switch
				else if (b)
					continue whileLoop;	// Continue to next iteration of labeled loop
				else
					break;				// Break from innermost loop/switch
			}
		}
		
		
		//// DO-WHILE loop
		
		do
		{
			// do something
		}
		while (a && b);
	}
	
	private void forLoops()
	{
		for (int i = 0; i < 100; i++)
		{
			System.out.println(i);
		}
		
		double[] myDoubleArray = new double[50];
		double value = 2.4d;
		
		for (int i = 0; i < myDoubleArray.length; i++)
		{
			myDoubleArray[i] = value;
			value *= 1.05;
		}
		
		DecimalFormat doubleFormat = new DecimalFormat("0.0##");
		for (double d : myDoubleArray)
		{
			System.out.println(doubleFormat.format(d));
		}
	}
}
