package com.isi.Airplane.view;

import com.isi.Airplane.model.Airplane;
import com.isi.Airplane.model.InvalidActionException;

import util.IO;

public class AirplaneConsole
{
	private Airplane airplane;
	public AirplaneConsole(Airplane airplane) {

		this.airplane=airplane;
	}
	public void start() {

		int choice = 0;
		while(true)
		{
			System.out.println("-------------");
			System.out.println("1 – Start motor\n2 - Take off\n3 - Stop motor\n4 -Increase altitude\n5 - Decrease altitude\n6 - Exit");
			choice = IO.getInt();
			try {
				switch(choice)
				{
				case 1:
					airplane.start();
					break;
				case 2 :
					airplane.takeOff();
					break;
				case 3:
					airplane.stopMotor();
					break;
				case 4:
					airplane.increaseAltitude();
					break;
				case 5 :
					airplane.decreaseAltitude();
					break;
				case 6:
					exit();
					break;

				}}
			catch (InvalidActionException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}}}
	private static void exit() {
		// TODO Auto-generated method stub
		System.out.println("You have exited from the menu");
		System.exit(0);


	}


}
