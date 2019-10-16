package com.isi.java.practical.model;

import java.io.Serializable;

public class GasLevelEvent implements Serializable
{
	public static final long serialVersionUID = 1L;
	
	public final double gasLevel;
	public final double gasCapacity;
	public final GasLevelState gasLevelState;
	
	public GasLevelEvent(Car car)
	{
		gasLevel = car.getGasLevel();
		gasCapacity = car.getGasCapacity();
		gasLevelState = car.getGasLevelState();
	}
}
