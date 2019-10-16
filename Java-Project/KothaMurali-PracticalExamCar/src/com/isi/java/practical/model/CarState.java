package com.isi.java.practical.model;

public enum CarState
{
	Stopped, Driving, Filling;
	
	
	// Instance methods: Get driving/filling state
	
	public boolean isDriving()
	{
		return CarState.isDriving(this);
	}
	
	public boolean isFilling()
	{
		return CarState.isFilling(this);
	}
	
	public String getDrivingState()
	{
		return CarState.getDrivingState(this);
	}
	
	public String getFillingState()
	{
		return CarState.getFillingState(this);
	}
	
	
	// Static methods: Get driving/filling state
	
	public static boolean isDriving(CarState state)
	{
		return state == CarState.Driving;
	}
	
	public static boolean isFilling(CarState state)
	{
		return state == CarState.Filling;
	}
	
	public static String getDrivingState(CarState state)
	{
		if (isDriving(state))
			return "Driving";
		else
			return "Stopped";
	}

	public static String getFillingState(CarState state)
	{
		if (isFilling(state))
			return "Filling";
		else 
			return "Not filling";
	}
}
