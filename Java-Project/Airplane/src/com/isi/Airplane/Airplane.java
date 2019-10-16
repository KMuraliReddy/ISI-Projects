package com.isi.Airplane;
public class Airplane {
	private double altitude = 0;
	private AirplaneState state=AirplaneState.OFF;
	private boolean checkState(AirplaneState state) {
		if(this.state==state) {
			return true;
		}
		else {
			System.out.println("error");
		}
		return false;
	}
	public void start() {
		// TODO Auto-generated method stub
		if (checkState(AirplaneState.OFF))
		{
			state = AirplaneState.RUNNING;
			System.out.println("The Airplane has started");
		}
	}
	public void takeOff() {
		if (checkState(AirplaneState.RUNNING)) {
			setAltitude(2000); //2000 is the initial altitude 
			state=AirplaneState.FLYING;
			System.out.println("Takeoff is Succesful " );
		}
	}
	public void stopMotor() {
		// TODO Auto-generated method stub
		if(checkState(AirplaneState.RUNNING)) {
			state=AirplaneState.OFF;
			System.out.println("The Airplane Has Stopped");
		}
	}
	public void increaseAltitude() {
		// TODO Auto-generated method stub
		if (checkState(AirplaneState.FLYING)) {
			setAltitude(altitude + 1000);
		}
	}
	public void decreaseAltitude() {
		// TODO Auto-generated method stub
		if (checkState(AirplaneState.FLYING)) {
			setAltitude(altitude - 1000);
		}
	}
	private void setAltitude(double altitude)
	{
		this.altitude = altitude;
		System.out.println("Current altitude is : "+ this.altitude);
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
		System.out.println("BOOM!!!");
		System.exit(0);
	}
	public void danger() {
		System.out.println("DANGER AIRPLANE ALTITUDE IS/ABOVE 10000!!!");
	}
	public void land() {
		state=AirplaneState.RUNNING;
	}
}