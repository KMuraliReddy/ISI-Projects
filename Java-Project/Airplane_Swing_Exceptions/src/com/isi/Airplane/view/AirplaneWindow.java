package com.isi.Airplane.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

import com.isi.Airplane.model.Airplane;
import com.isi.Airplane.model.AirplaneState;
import com.isi.Airplane.model.IAirplaneModel;
import com.isi.Airplane.model.InvalidActionException;

public class AirplaneWindow extends JFrame implements IAirplaneView
{
	private JLabel stateTitle;
	private JLabel stateLabel;
	private JLabel altitudeTitle;
	private JLabel altitudeLabel;
	private JLabel targetAltitudeTitle;
	private JLabel targetAltitudeLabel;
	private JProgressBar altitudeProgressBar;

	private JButton startButton;
	private JButton stopButton;
	private JButton takeOffButton;
	private JButton increaseButton;
	private JButton decreaseButton;

	private JLabel messageLabel;

	private JPanel statePanel;
	private JPanel altitudePanel;
	private JPanel targetAltitudePanel;
	private JPanel stateAltitudePanel;
	private JPanel statsProgressPanel;
	private JPanel startStopPanel;
	private JPanel takeOffPanel;
	private JPanel increaseDecreasePanel;
	private JPanel messagePanel;

	private JPanel contentPane;
	//private Airplane airplane;
	
	private IAirplaneModel airplanemodel;
	private final DecimalFormat df=new DecimalFormat("0.00");
	public AirplaneWindow(IAirplaneModel airplainModel)
	{
		super("Airplane manager");
		//Airplane airplane=new Airplane();
		this.airplanemodel=airplainModel;
		createComponents();
		addListeners();
		setupPanels();
		addComponentsToPanels();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void createComponents()
	{
		startButton = new JButton("Start");
		stopButton = new JButton("Stop");
		takeOffButton = new JButton("Take off");
		increaseButton = new JButton("Increase altitude");
		decreaseButton = new JButton("Decrease altitude");

		stateTitle = new JLabel("State");
		stateLabel = new JLabel("Off");
		stateTitle.setAlignmentX(0.5f);
		stateLabel.setAlignmentX(0.5f);
		stateTitle.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));

		altitudeTitle = new JLabel("Altitude");
		altitudeLabel = new JLabel("0.0");
		altitudeTitle.setAlignmentX(0.5f);
		altitudeLabel.setAlignmentX(0.5f);
		altitudeTitle.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
		
		targetAltitudeTitle = new JLabel("Target Altitude");
		targetAltitudeLabel = new JLabel("0.0");
		targetAltitudeTitle.setAlignmentX(0.5f);
		targetAltitudeLabel.setAlignmentX(0.5f);
		targetAltitudeTitle.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));

		altitudeProgressBar = new JProgressBar(0, 12000);
		altitudeProgressBar.setToolTipText("Altitude");
		messageLabel = new JLabel(" ");
		messageLabel.setBorder(
				BorderFactory.createCompoundBorder(
						BorderFactory.createEtchedBorder(),
						BorderFactory.createEmptyBorder(20, 20, 20, 20)));
		messageLabel.setPreferredSize(new Dimension(400, 60));
		messageLabel.setAlignmentX(0.5f);
		messageLabel.setHorizontalAlignment(SwingUtilities.CENTER);
	}

	private void addListeners()
	{
		startButton.addActionListener((ActionEvent e) ->
		{

			try {
				airplanemodel.start();
				/*stateLabel.setText(airplane.state.toString());
				stateLabel.setText(airplanemodel.state.toString());
				altitudeProgressBar.setValue((int) (airplane.altitude));*/
			} catch (InvalidActionException e1) {
				// TODO Auto-generated catch block
				displayError(e1.getMessage());
			}

		});
		takeOffButton.addActionListener((ActionEvent e) ->
		{

			try {
				airplanemodel.takeOff();
				/*stateLabel.setText(airplane.state.toString());
				altitudeProgressBar.setValue((int) (airplane.altitude));
				altitudeLabel.setText(Double.toString(airplane.altitude));;*/
			} catch (InvalidActionException e1) {
				// TODO Auto-generated catch block
				displayError(e1.getMessage());
			}

		});
		stopButton.addActionListener((ActionEvent e) ->
		{

			try {
				airplanemodel.stop();
				/*stateLabel.setText(airplane.state.toString());
				altitudeProgressBar.setValue((int) (airplane.altitude));
				altitudeLabel.setText(Double.toString(airplane.altitude));;*/
			} catch (InvalidActionException e1) {
				// TODO Auto-generated catch block
				displayError(e1.getMessage());
			}

		});
		increaseButton.addActionListener((ActionEvent e) ->
		{

			try {
                
				airplanemodel.increaseAltitude();
				/*checkAltitudeLevel(airplane.altitude);
				stateLabel.setText(airplane.state.toString());
				altitudeProgressBar.setValue((int) (airplane.altitude));

				altitudeLabel.setText(Double.toString(airplane.altitude));;*/

			} catch (InvalidActionException e1) {
				// TODO Auto-generated catch block
				displayError(e1.getMessage());
			}

		});
		decreaseButton.addActionListener((ActionEvent e) ->
		{

			try {

				airplanemodel.decreaseAltitude();
				
			} catch (InvalidActionException e1) {
			
				displayError(e1.getMessage());
			}

		});



	}

	private void setupPanels()
	{
		startStopPanel = new JPanel();
		takeOffPanel = new JPanel();
		increaseDecreasePanel = new JPanel();

		statePanel = new JPanel();
		statePanel.setLayout(new BoxLayout(statePanel, BoxLayout.Y_AXIS));

		altitudePanel = new JPanel();
		altitudePanel.setLayout(new BoxLayout(altitudePanel, BoxLayout.Y_AXIS));
		
		

		stateAltitudePanel = new JPanel();
		stateAltitudePanel.setLayout(new BoxLayout(stateAltitudePanel, BoxLayout.X_AXIS));
		
		targetAltitudePanel=new JPanel();
		targetAltitudePanel.setLayout(new BoxLayout(targetAltitudePanel, BoxLayout.Y_AXIS));

		statsProgressPanel = new JPanel();
		statsProgressPanel.setLayout(new BoxLayout(statsProgressPanel, BoxLayout.Y_AXIS));
		statsProgressPanel.setBorder(
				BorderFactory.createCompoundBorder(
						BorderFactory.createEtchedBorder(),
						BorderFactory.createEmptyBorder(20, 20, 20, 20)));

		messagePanel = new JPanel();

		// Get the contentPane JPanel created by the JFrame window
		contentPane = (JPanel)getContentPane();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		contentPane.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
	}

	private void addComponentsToPanels()
	{
		statePanel.add(stateTitle);
		statePanel.add(stateLabel);

		altitudePanel.add(altitudeTitle);
		altitudePanel.add(altitudeLabel);
		
		
		targetAltitudePanel.add(targetAltitudeTitle);
		targetAltitudePanel.add(targetAltitudeLabel);

		stateAltitudePanel.add(statePanel);
		stateAltitudePanel.add(Box.createRigidArea(new Dimension(30, 0)));
		stateAltitudePanel.add(altitudePanel);
		stateAltitudePanel.add(Box.createRigidArea(new Dimension(30, 0)));
		stateAltitudePanel.add(targetAltitudePanel);

		statsProgressPanel.add(stateAltitudePanel);
		statsProgressPanel.add(Box.createRigidArea(new Dimension(0, 30)));
		statsProgressPanel.add(altitudeProgressBar);

		startStopPanel.add(startButton);
		startStopPanel.add(stopButton);
		takeOffPanel.add(takeOffButton);
		increaseDecreasePanel.add(increaseButton);
		increaseDecreasePanel.add(decreaseButton);

		messagePanel.add(messageLabel);

		contentPane.add(statsProgressPanel);
		contentPane.add(Box.createRigidArea(new Dimension(0, 30)));
		contentPane.add(startStopPanel);
		contentPane.add(takeOffPanel);
		contentPane.add(increaseDecreasePanel);
		contentPane.add(Box.createRigidArea(new Dimension(0, 30)));
		contentPane.add(messagePanel);
	}
	
/*	private void checkAltitudeLevel(double altitudeValue) {
		if(airplane.altitude<10000) {
			messageLabel.setText("");

		}
		else if(airplane.altitude>=10000 && airplane.altitude<12000) {
			messageLabel.setText("DANGER AIRPLANE ALTITUDE IS/ABOVE 10000!!!");

		}
		else if(airplane.altitude>=12000) {
			messageLabel.setText("BOOM!");
		}

	}*/

	@Override
	public void updateState(AirplaneState state) {
		stateLabel.setText(state.toString());
	}

	@Override
	public void updateAltitude(double altitude) {

		altitudeLabel.setText(df.format(altitude));
		

        altitudeProgressBar.setValue((int)altitude);
	}

	@Override
	public void displayMessage(String message) {

		messageLabel.setText(message);
	}

	@Override
	public void displayError(String message) {

		
		JOptionPane.showMessageDialog(this, message,"Error",JOptionPane.WARNING_MESSAGE);
	}

	

	
}