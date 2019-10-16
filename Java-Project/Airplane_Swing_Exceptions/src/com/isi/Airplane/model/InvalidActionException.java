package com.isi.Airplane.model;

public class InvalidActionException extends Exception { 

	private AirplaneState requiredState;
	private AirplaneState actualState;
	
	public AirplaneState getRequiresState() {
		return requiredState;
	}
	public AirplaneState actualState() {
		return actualState;
	}

	public InvalidActionException(AirplaneState requiredstate,AirplaneState actualState)
	{
		super("Invalid Action : The Actual State Is :  " + actualState +" Not : "+requiredstate);
		this.requiredState=requiredstate;
		this.actualState=actualState;
	}

}
