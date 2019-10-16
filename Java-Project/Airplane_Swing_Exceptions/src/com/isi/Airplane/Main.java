package com.isi.Airplane;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.isi.Airplane.model.Airplane;
import com.isi.Airplane.model.IAirplaneModel;
import com.isi.Airplane.view.AirplaneWindow;
import com.isi.Airplane.view.IAirplaneView;

public class Main
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(() -> start());
	}

	private static void start()
	{

		setSystemLookAndFeel();

		Airplane airplane=new Airplane();
		IAirplaneModel iairplain=(IAirplaneModel)(airplane);
		AirplaneWindow airplainwindow=new AirplaneWindow(iairplain);
		IAirplaneView iview=(IAirplaneView)airplainwindow;
		airplane.setView(iview);
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