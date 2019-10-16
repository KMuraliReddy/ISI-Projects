package com.isi.java.practical.view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import com.isi.java.practical.model.CapacityException;
import com.isi.java.practical.model.Car;
import com.isi.java.practical.model.ICarModel;
import com.isi.java.practical.network.CarClient;

public class SetupWindow extends JFrame
{
	private JTextField capacityTextField;
	
	public SetupWindow()
	{
		super("Setup");

		JLabel capacityLabel = new JLabel("Enter gas capacity:");
		this.capacityTextField = new JTextField(8);
		JButton createCarButton = new JButton("Create car");
		
		createCarButton.addActionListener((ActionEvent e) -> setupModelView());
        
		JPanel capacityPanel = new JPanel();
		capacityPanel.add(capacityLabel);
		capacityPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		capacityPanel.add(capacityTextField);

		JPanel buttonPanel = new JPanel();
		buttonPanel.add(createCarButton);

		JPanel contentPane = (JPanel)getContentPane();
		contentPane.setLayout(new GridLayout(2, 1, 0, 0));
		contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		contentPane.add(capacityPanel);
		contentPane.add(buttonPanel);

		getRootPane().setDefaultButton(createCarButton);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void setupModelView()
	{
		
			try {
				
				
				Car car=new Car(Double.parseDouble(capacityTextField.getText()));
				CarManagerWindow carmanagrWindow=	new CarManagerWindow(car);
				//ICarModel icarModel=(ICarModel)(car);
				ICarView icarView=(ICarView)carmanagrWindow;
				CarClient carClient= new CarClient();
				car.setView(icarView);
				car.setClient(carClient);
				
				dispose();
				// Get text from capacity text field
			    // ** Convert capacity from string to double value
			    // ** Make new car (pass it the capacity)
			    // Make new window (pass it the car)
			    // Make new client (pass it the car)
			    // Set the car's view (pass it the window)

			    // Set the car's client (pass it the client)
			    // Close the setup window (dispose)
			    //
			    //// [Lines above marked ** can throw an exception]
			    //
			    // Catch first type of exception:
			    //// Call showWarningDialog(...)
			    // Catch second type of exception:
			    //// Call showWarningDialog(...)
				
				
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				showWarningDialog("Enter Valid Number");
				
			} catch (CapacityException e) {
				// TODO Auto-generated catch block
				showWarningDialog(e.getMessage());
			}
		
	
		
	}
	
	private void showWarningDialog(String message)
	{
		JOptionPane optionPane = new JOptionPane(
				message,
				JOptionPane.WARNING_MESSAGE,
				JOptionPane.DEFAULT_OPTION);
		JDialog dialog = optionPane.createDialog(this, "Warning");
		Point parentLocation = dialog.getLocation();
		dialog.setLocation(parentLocation.x, parentLocation.y + 140);
		dialog.setVisible(true);
	}
	public static boolean isDouble(String text) {
		boolean isTextfieldDouble=true;
		try { 

			double parsedDouble = Double.parseDouble(text); 
			isTextfieldDouble=true;
		} 
		catch (NumberFormatException e1) { 
			isTextfieldDouble=false;
		}

		return isTextfieldDouble;
	}
}
