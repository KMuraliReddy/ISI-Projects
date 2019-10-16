package com.isi.java.practical.model;

public interface ICarModel
{
	// Getter methods
	double getGasLevel();
	double getGasCapacity();
	GasLevelState getGasLevelState();
	CarState getCarState();
	
	// User action methods
	void startDriving() throws CapacityException;
	void stopDriving();
	void startFillingGas() throws CapacityException;
	void stopFillingGas();
}
