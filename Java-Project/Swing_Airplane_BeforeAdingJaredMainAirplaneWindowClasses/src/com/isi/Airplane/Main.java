package com.isi.Airplane;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.isi.Airplane.model.Airplane;
import com.isi.Airplane.view.AirplaneWindow;

public class Main
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(() -> start());
	}
	
	private static void start()
	{
		Airplane airplane =new Airplane();
		setSystemLookAndFeel();
		new AirplaneWindow(airplane);
	}
	
	private static void setSystemLookAndFeel()
	{
		try
		{
			UIManager.setLookAndFeel(
					UIManager.getSystemLookAndFeelClassName());
		}
		catch (ClassNotFoundException | InstantiationException |
				IllegalAccessException | UnsupportedLookAndFeelException e)
		{}
	}
}