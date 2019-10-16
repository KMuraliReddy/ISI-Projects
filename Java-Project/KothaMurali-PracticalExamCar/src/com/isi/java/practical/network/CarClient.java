package com.isi.java.practical.network;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import com.isi.java.practical.model.Car;
import com.isi.java.practical.model.CarState;
import com.isi.java.practical.model.GasLevelEvent;
import com.isi.java.practical.view.ICarView;

public class CarClient implements ICarView
{
	// Update view methods
	// Implementation of ICarView interface

 
	@Override
	public void updateGasLevel(GasLevelEvent event)
	{
		//// If gas is empty or full, then send event info package to server
		

		// make new Socket host = "localhost", 7777
		// from socke
		try (
				Socket socket = new Socket("localhost", 7770);
				ObjectOutputStream out =
						new ObjectOutputStream(socket.getOutputStream());
			)
		{
	
			//System.out.println("The Gas Level Is Full");
			
			out.writeObject(event);
			
			
		}
		catch (IOException e) { e.printStackTrace(); }
		}
	

	@Override
	public void updateCarState(CarState carState) { }	// Do nothing
}
