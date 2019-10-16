package com.isi.java.practical;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.isi.java.practical.view.CarManagerWindow;
import com.isi.java.practical.view.SetupWindow;

public class Main
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(() ->
		{
			setSystemLookAndFeel();
			new SetupWindow();
		});
	}
	
	private static void setSystemLookAndFeel()
	{
		try 
		{
			UIManager.setLookAndFeel(
					UIManager.getSystemLookAndFeelClassName());
		}
		catch (UnsupportedLookAndFeelException | ClassNotFoundException |
				InstantiationException | IllegalAccessException e) {}
	}
}
