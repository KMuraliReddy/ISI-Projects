package com.isi.java.practical.model;

public class CapacityException extends Exception
{	
	public CapacityException(double gasCapacity, double minCapacity, double maxCapacity)
	{
		////
		super("Invalid Capacity : Please Enter The Capacity In The Range of "+minCapacity + " and "+maxCapacity);
	}
}
