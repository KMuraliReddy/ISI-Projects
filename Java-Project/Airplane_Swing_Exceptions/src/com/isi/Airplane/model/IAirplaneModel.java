package com.isi.Airplane.model;

public interface IAirplaneModel
{
	void start() throws InvalidActionException;
	void stop()throws InvalidActionException;
	void takeOff()throws InvalidActionException;
	void increaseAltitude()throws InvalidActionException;
	void decreaseAltitude()throws InvalidActionException;
	

	AirplaneState getState();
	double getAltitude();
	

}
