package com.isi.Airplane.model;

public class Airplane {
	public double altitude = 0;
	public static AirplaneState state=AirplaneState.OFF;

	public void checkState(AirplaneState state) throws InvalidActionException {
		if(this.state!=state) 
		{
			throw new InvalidActionException(state,this.state);

		}

	}


	public  void start() throws InvalidActionException {
		// TODO Auto-generated method stub

		checkState(AirplaneState.OFF);
		state=AirplaneState.RUNNING;

	}

	public void takeOff() throws InvalidActionException {
		checkState(AirplaneState.RUNNING);
		setAltitude(2000); //2000 is the initial altitude 
		state=AirplaneState.FLYING;


	}

	public void stopMotor() throws InvalidActionException{
		// TODO Auto-generated method stub
		checkState(AirplaneState.RUNNING);
		state=AirplaneState.OFF;

	}
	public void increaseAltitude() throws InvalidActionException {
		// TODO Auto-generated method stub
		checkState(AirplaneState.FLYING);
		setAltitude(altitude + 1000);

	}
	public void decreaseAltitude() throws InvalidActionException{
		// TODO Auto-generated method stub
		checkState(AirplaneState.FLYING) ;
		setAltitude(altitude - 1000);

	}
	private void setAltitude(double altitude)
	{
		this.altitude = altitude;

		if(this.altitude>=12000) {
			explode();
		}
		else if(this.altitude>=10000) {
			danger();
		}
		else if(this.altitude<=0) {
			this.altitude = 0;
			land();
		}
	}
	public void explode() {
		//System.out.println("BOOM!!!");
		System.exit(0);
	}
	public void danger() {
		//System.out.println("DANGER AIRPLANE ALTITUDE IS/ABOVE 10000!!!");
	}
	public void land() {
		state=AirplaneState.RUNNING;
	}
}