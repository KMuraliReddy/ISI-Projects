package com.isi.Airplane.model;

import com.isi.Airplane.view.AirplaneWindow;
import com.isi.Airplane.view.IAirplaneView;

public class Airplane implements IAirplaneModel
{
	public double altitude = 0;
	public double targetAltitude=0;
	public static AirplaneState state=AirplaneState.OFF;
	private IAirplaneView airplainview;
	private void setState(AirplaneState state) {
		this.state=state;
		airplainview.updateState(state);
	}

	public void checkState(AirplaneState state) throws InvalidActionException {
		
		
		if(this.state!=state) 
		{
			throw new InvalidActionException(state,this.state);

		}

	}


	public  void start() throws InvalidActionException {
		// TODO Auto-generated method stub

		checkState(AirplaneState.OFF);
		airplainview.displayMessage("Airplain Is Starting");
		state=AirplaneState.RUNNING;
		//airplainview.updateState(AirplaneState.RUNNING);
		setState(state);

	}

	public void takeOff() throws InvalidActionException {
		checkState(AirplaneState.RUNNING);
		altitude=2000;
		airplainview.updateAltitude(altitude); //2000 is the initial altitude
		state=AirplaneState.FLYING;
		setState(state);
		airplainview.displayMessage("");

	}

	public void stop() throws InvalidActionException{
		// TODO Auto-generated method stub
		checkState(AirplaneState.RUNNING);
		state=AirplaneState.OFF;
		airplainview.displayMessage("Airplain Stopped");

	}
	public void increaseAltitude() throws InvalidActionException {
		// TODO Auto-generated method stub
		state=AirplaneState.FLYING;
		checkState(state);
		setAltitude(altitude + 1000);
			

	}
	public void decreaseAltitude() throws InvalidActionException{
		// TODO Auto-generated method stub
		state=AirplaneState.FLYING;
		checkState(state) ;
		setAltitude(altitude - 1000);

	}
	private void setAltitude(double altitude)
	
	{
		
		this.altitude = altitude;
		airplainview.updateAltitude(altitude);

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
		
		airplainview.displayError("BOOM");
		System.exit(0);
	}
	public void danger() {
		airplainview.displayMessage("Danger !! Altitude is Above 10000 !!" );
	}
	public void land() {
		airplainview.updateAltitude(0);
		state=AirplaneState.RUNNING;
		setState(state);
	}

	@Override
	public AirplaneState getState() {
		// TODO Auto-generated method stub
		return state;
	}


	@Override
	public double getAltitude() {
		// TODO Auto-generated method stub
		return altitude;
	}
	public void setView(IAirplaneView airplainview) {
		this.airplainview=airplainview;
	}

	
	/*private void changeAltitude()
    {
        double updatesPerSecond=10;
        double altitudeChangePerSecond =500;
        
        double milliSecondsPerUpdate = 1000 / updatesPerSecond;
        
        double altitudeChangePerUpdate = altitudeChangePerSecond / updatesPerSecond;
        
        
        while(altitude != TargetAltitude)
        {
            if (Math.abs(altitude - TargetAltitude)  <= altitudeChangePerSecond)
                    {
                
                setAltitude(TargetAltitude);
                break;
                    }
            else
                if(TargetAltitude > altitude)
                {
            
                
            if(TargetAltitude > altitude)
            {
                setAltitude(altitude+20);
                
            }
            else 
            {
            setAltitude(altitude-20);
            }
            
            try {
                Thread.sleep((long)milliSecondsPerUpdate);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            
                }
        }
      

    }
  */
	
	


}