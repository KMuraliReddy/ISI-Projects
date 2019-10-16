package com.isi.java.practical.view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import com.isi.java.practical.model.CapacityException;
import com.isi.java.practical.model.Car;
import com.isi.java.practical.model.CarState;
import com.isi.java.practical.model.GasLevelEvent;
import com.isi.java.practical.model.ICarModel;

public class CarManagerWindow extends JFrame implements ICarView
{	
	private JLabel drivingStateLabel;
	private JLabel fillingStateLabel;
	private JLabel gasLevelLabel;
	private JLabel gasCapacityLabel;
	private JProgressBar gasLevelProgressBar;
	
	private ICarModel carModel;

	private static final DecimalFormat levelFormat = new DecimalFormat("0.0");

	public CarManagerWindow(Car car) ////
	{
		super("Car manager");

		this.carModel=car;
		// Create/configure basic components

		JButton driveCarButton = new JButton("Drive car");
		JButton stopCarButton = new JButton("Stop car");

		JLabel drivingStateTextLabel = new JLabel("State:");
		this.drivingStateLabel = new JLabel(CarState.Stopped.getDrivingState());

		JButton startFillingButton = new JButton("Start filling gas");
		JButton stopFillingButton = new JButton("Stop filling gas");

		JLabel fillingStateTextLabel = new JLabel("State:");
		this.fillingStateLabel = new JLabel(CarState.Stopped.getFillingState());

		JLabel gasLevelTextLabel = new JLabel("Gas level:");
		this.gasLevelLabel = new JLabel(levelFormat.format(0));
		JLabel gasCapacityTextLabel = new JLabel("Gas capacity:");
		gasCapacityLabel = new JLabel(levelFormat.format(0));

		this.gasLevelProgressBar = new JProgressBar(0, (int)car.getGasCapacity());
		

		JButton newCarButton = new JButton("New car");
		JButton exitButton = new JButton("Exit");

		
		// Add action listeners to buttons

		addListenersToButtons(
				driveCarButton, stopCarButton,
				startFillingButton, stopFillingButton,
				newCarButton, exitButton);
		
		
		// Add components to panels

		JPanel driveStopCarPanel = new JPanel();
		driveStopCarPanel.add(driveCarButton);
		driveStopCarPanel.add(stopCarButton);

		JPanel drivingStatePanel = new JPanel();
		drivingStatePanel.add(drivingStateTextLabel);
		drivingStatePanel.add(Box.createRigidArea(new Dimension(5, 0)));
		drivingStatePanel.add(drivingStateLabel);

		JPanel startStopFillingPanel = new JPanel();
		startStopFillingPanel.add(startFillingButton);
		startStopFillingPanel.add(stopFillingButton);

		JPanel fillingStatePanel = new JPanel();
		fillingStatePanel.add(fillingStateTextLabel);
		fillingStatePanel.add(Box.createRigidArea(new Dimension(5, 0)));
		fillingStatePanel.add(fillingStateLabel);

		JPanel gasLevelPanel = new JPanel();
		gasLevelPanel.add(gasLevelTextLabel);
		gasLevelPanel.add(Box.createRigidArea(new Dimension(5, 0)));
		gasLevelPanel.add(gasLevelLabel);

		JPanel gasCapacityPanel = new JPanel();
		gasCapacityPanel.add(gasCapacityTextLabel);
		gasCapacityPanel.add(Box.createRigidArea(new Dimension(5, 0)));
		gasCapacityPanel.add(gasCapacityLabel);

		JPanel levelCapacityPanel = new JPanel(new GridLayout(1, 2, 0, 0));
		levelCapacityPanel.add(gasLevelPanel);
		levelCapacityPanel.add(gasCapacityPanel);

		JPanel gasProgressPanel = new JPanel();
		gasProgressPanel.add(gasLevelProgressBar);

		JPanel controlButtonsPanel = new JPanel();
		controlButtonsPanel.add(newCarButton);
		controlButtonsPanel.add(exitButton);


		// Add components/panels to content pane

		JPanel contentPane = (JPanel)getContentPane();
		contentPane.setLayout(new GridLayout(7, 1, 0, 10));
		contentPane.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

		contentPane.add(driveStopCarPanel);
		contentPane.add(drivingStatePanel);
		contentPane.add(startStopFillingPanel);
		contentPane.add(fillingStatePanel);
		contentPane.add(levelCapacityPanel);
		contentPane.add(gasProgressPanel);
		contentPane.add(controlButtonsPanel);
		
		
		// Configure window

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	// Method for adding action listeners to buttons
	
	private void addListenersToButtons(
			JButton driveCarButton, JButton stopCarButton,
			JButton startFillingButton, JButton stopFillingButton,
			JButton newCarButton, JButton exitButton)
	{
		exitButton.addActionListener((ActionEvent e) ->
		{
		System.exit(0);
		});
		driveCarButton.addActionListener((ActionEvent e) -> 
		{
			try {
				carModel.startDriving();
			} catch (CapacityException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showInternalMessageDialog(this, e1.getMessage());
			}
			
		});
		stopCarButton.addActionListener((ActionEvent e) -> 
		{
			carModel.stopDriving();
		});
		startFillingButton.addActionListener((ActionEvent e) -> 
		{
			try {
				carModel.startFillingGas();
			} catch (CapacityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		});
		stopFillingButton.addActionListener((ActionEvent e) -> 
		{
			carModel.stopFillingGas();
		});
		newCarButton.addActionListener((ActionEvent e) -> 
		{
			dispose();
			new SetupWindow();
			
		});
		
		////
	}
	

	
	// Update view methods
	// Implementation of ICarView interface
	
	@Override
	public void updateGasLevel(GasLevelEvent event)
	{
		
		gasLevelProgressBar.setValue((int)event.gasLevel);
		gasLevelLabel.setText(String.valueOf((int)event.gasLevel));
		gasCapacityLabel.setText(String.valueOf(event.gasCapacity));
		//gasCapacityLabel.setText();
		
	
	}

	@Override
	public void updateCarState(CarState carState)
	{
		if(carState.toString()!="Filling") {
		drivingStateLabel.setText(carState.toString());
		fillingStateLabel.setText("Not Filling");
	}
		else {
			fillingStateLabel.setText(carState.toString());
		}
}}
