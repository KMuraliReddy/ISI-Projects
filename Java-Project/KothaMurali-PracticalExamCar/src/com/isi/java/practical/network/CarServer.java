
package com.isi.java.practical.network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DecimalFormat;
import java.util.Calendar;

import com.isi.java.practical.model.GasLevelEvent;

public class CarServer
{
	private static final DecimalFormat timeFormat = new DecimalFormat("00");
	private static final DecimalFormat levelFormat = new DecimalFormat("0.0");
	
	public static void main(String[] args)
	{
		try (ServerSocket serverSocket = new ServerSocket(7770))
		{
			while (true)
			{
				try
				{
					Socket clientSocket = serverSocket.accept();
					Thread clientThread = new Thread(() -> clientHandler(clientSocket));
					clientThread.start();
				}
				catch (IOException e) { displayError(e); }
			}
		}
		catch (IOException e) { displayError(e); }
	}

	private static void clientHandler(Socket clientSocket)
	{
		try
		{
			ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
			Object object = in.readObject();
			System.out.println((object == null) ? "Server: null" : "Server: not null");
			if (object instanceof GasLevelEvent)
			{
				GasLevelEvent event = (GasLevelEvent)object;
				
				Calendar now = Calendar.getInstance();
				String date = now.get(Calendar.YEAR) + "-"
						+ timeFormat.format(now.get(Calendar.MONTH) + 1) + "-"
						+ timeFormat.format(now.get(Calendar.DATE));
				String time = (timeFormat.format(now.get(Calendar.HOUR_OF_DAY)) + ":" + timeFormat.format(now.get(Calendar.MINUTE)));

				String levelState = event.gasLevelState.toString();
				String level = levelFormat.format(event.gasLevel);
				String capacity = levelFormat.format(event.gasCapacity);

				System.out.println("Car server:\tCar notification:\t" + date + "  " + time);
				System.out.println("\t\tGas level state:\t" + levelState);
				System.out.println("\t\tGas level:\t\t"	+ level + " / " + capacity);
				System.out.println();
			}
		}
		catch (IOException | ClassNotFoundException e) { displayError(e); }
	}
	
	private static void displayError(Throwable e)
	{
		System.out.println("Car server error:  " + e.getMessage());
		System.out.println();
	}
}
