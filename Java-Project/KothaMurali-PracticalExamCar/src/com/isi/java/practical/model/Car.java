package com.isi.java.practical.model;

import javax.swing.JOptionPane;

import com.isi.java.practical.view.CarManagerWindow;
import com.isi.java.practical.view.ICarView;



public class Car implements ICarModel, Runnable
{	
	// Static constants

	public static final double minCapacity = 35;
	public static final double maxCapacity = 95;
	public static final double drivingDelta = -2.3d;
	public static final double fillingDelta = 3.6d;


	// Instance variables

	private double gasLevel;
	private double gasCapacity;
	private GasLevelState gasLevelState;
	private CarState carState=CarState.Stopped;

	private ICarView view;
	private ICarView client;
    private boolean isFilling=false;

	// Getter methods
	// Implementation of ICarModel interface

	@Override
	public double getGasLevel() {
		return gasLevel;
	}
	@Override
	public double getGasCapacity() {
		return gasCapacity; 
	}
	@Override
	public GasLevelState getGasLevelState() {
		return gasLevelState;
	}
	@Override
	public CarState getCarState() { 
		return carState; 
	}


	// Constructor

	public Car(double capacity) throws CapacityException ////

	{




		if(capacity < minCapacity || capacity > maxCapacity) {

			throw new CapacityException(capacity, minCapacity, maxCapacity);

		}
		this.gasCapacity=capacity;
		gasLevel = 0;
		gasLevelState = GasLevelState.Empty;
		carState = CarState.Stopped;



		////
	}


	// Public setter methods for the 2 views:
	// the main UI view, and the client view


	public void setView(ICarView view)
	{
		this.view=view;
	}

	public void setClient(ICarView client)
	{
		this.client=client;
	}


	// Private setter methods for gas level and car state

	private synchronized void setGasLevel(double gasLevel)
	{
		this.gasLevel=gasLevel;	
		
		view.updateGasLevel(new GasLevelEvent(this));
		client.updateGasLevel(new GasLevelEvent(this));
	}

	private synchronized void setCarState(CarState state)
	{
		this.carState=state;
		view.updateCarState(carState);
		
		
		
	}


	// User action methods
	// Implementation of ICarModel interface

	@Override
	public void startDriving() throws CapacityException
	{
		if(checkState(CarState.Stopped)) {

			carState=carState.Driving;
			setCarState(carState);
			Thread t = new Thread(() -> run());
			t.start();
			view.updateGasLevel(new GasLevelEvent(this));
			client.updateGasLevel(new GasLevelEvent(this));
		}
	}

	@Override
	public void stopDriving()
	{
		if(checkState(CarState.Driving) && gasLevel!=0) {
			carState=carState.Stopped;
			setCarState(carState);
		}
	}

	@Override
	public void startFillingGas() throws CapacityException
	{
	 if(checkState(carState.Stopped)) {
		 isFilling=true;
		 carState=carState.Filling;
		 setCarState(carState);
		 Thread t = new Thread(() -> run());
			t.start();
			
	
	 }
	}

	@Override
	public void stopFillingGas()
	{
		if(checkState(carState.Filling)) {
			isFilling=false;
			carState=carState.Stopped;
			setCarState(carState);
			
		}
	}


	// Thread method
	// Implementation of Runnable interface

	@Override
	public void run()
	{
		double gasChangePerSecond=3.6;
		 double updatesPerSecond=2;
		 
		 double millisecondsPerUpdate=1000/10;
		 double gasChangePerupdate=gasChangePerSecond/2;
		
		 while(getGasLevel()<=getGasCapacity() && isFilling ) {
			 if(Math.abs(getGasLevel() + gasChangePerSecond)<=getGasCapacity()) {
				
				 
					 gasLevel=getGasLevel()+gasChangePerupdate;
					 setGasLevel(gasLevel);
					
				 
				 try {
					 Thread.sleep((long)(millisecondsPerUpdate));
				 }
				 catch (InterruptedException e) {
					 JOptionPane.showMessageDialog(null,e.getMessage());
				 }
			 }
		 }
		 while(getGasLevel()>=0 && carState.isDriving()) {
			 if(getGasLevel()==0) {
				 setGasLevel(0);
				 setCarState(CarState.Stopped);
			 }
			 else {
				 setGasLevel(gasLevel-2.3);
				 try {
					 Thread.sleep((long)(millisecondsPerUpdate));
				 }
				 catch (InterruptedException e) {
					JOptionPane.showMessageDialog(null,e.getMessage());
				}
				 
			 }
		 }
		 
		 
	 
		
	}
	public boolean checkState(CarState state) {
		
		if(this.carState!=state) 
			return false;
		return true;
	}
	private void setState(CarState state) {
		this.carState=state;
		

	}
}
