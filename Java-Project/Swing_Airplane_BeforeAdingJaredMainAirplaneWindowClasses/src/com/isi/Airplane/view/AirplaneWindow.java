package com.isi.Airplane.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import com.isi.Airplane.model.Airplane;
import com.isi.Airplane.model.InvalidActionException;


public class AirplaneWindow extends JFrame
{

	private JPanel contentPane;
	private JPanel topPane;
	private JPanel stateAndAltitudeLabelPanel;
	private JPanel stateAndAltitudeValLabelPanel;
	private JPanel stateAndAltitudePanel;
	private JPanel startStopPane;
	private JPanel takeOffPane;
	private JPanel altitudeSetPane;
	private JPanel buttonsPane;
	private JPanel resultPane;

	private JButton start;
	private JButton stop;
	private JButton takeOff;
	private JButton increaseAltitude;
	private JButton decreaseAltitude;

	private JLabel message_label;
	private JLabel state;
	private JLabel state_val;
	private JLabel altitude;
	private JLabel altitude_val;

	private JProgressBar progressBar;

	private static Airplane airplane;
	public AirplaneWindow(Airplane airplane) {
		super("Airplane Manager");
		this.airplane=airplane;
		createComponents();
		addListenersToButtons();
		setUpPanels();
		addComponentsToPanels();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();//auto window size according to the elements
		setLocationRelativeTo(null);
		setVisible(true);
	}
	private void createComponents() {

		state=new JLabel("STATE");
		state_val=new JLabel("OFF");
		altitude=new JLabel("ALTITUDE");
		altitude_val=new JLabel("0.0");

		start=new JButton("START");
		stop=new JButton("STOP");
		takeOff=new JButton("TAKE OFF");
		increaseAltitude=new JButton("Increase ALtitude");
		decreaseAltitude=new JButton("Decrease Altitude");

		progressBar=new JProgressBar(0,12000);

		message_label=new JLabel("");

	}
	private void addListenersToButtons() {

		start.addActionListener((ActionEvent e) ->
		{

			try {
				airplane.start();
				state_val.setText(airplane.state.toString());
				progressBar.setValue((int) (airplane.altitude));
			} catch (InvalidActionException e1) {
				// TODO Auto-generated catch block
				dialogPopUp(e1.getMessage());
			}

		});
		takeOff.addActionListener((ActionEvent e) ->
		{

			try {
				airplane.takeOff();
				state_val.setText(airplane.state.toString());
				progressBar.setValue((int) (airplane.altitude));
				altitude_val.setText(Double.toString(airplane.altitude));;
			} catch (InvalidActionException e1) {
				// TODO Auto-generated catch block
				dialogPopUp(e1.getMessage());
			}

		});
		stop.addActionListener((ActionEvent e) ->
		{

			try {
				airplane.stopMotor();
				state_val.setText(airplane.state.toString());
				progressBar.setValue((int) (airplane.altitude));
				altitude_val.setText(Double.toString(airplane.altitude));;
			} catch (InvalidActionException e1) {
				// TODO Auto-generated catch block
				dialogPopUp(e1.getMessage());
			}

		});
		increaseAltitude.addActionListener((ActionEvent e) ->
		{

			try {

				airplane.increaseAltitude();
				checkAltitudeLevel(airplane.altitude);
				state_val.setText(airplane.state.toString());
				progressBar.setValue((int) (airplane.altitude));

				altitude_val.setText(Double.toString(airplane.altitude));;

			} catch (InvalidActionException e1) {
				// TODO Auto-generated catch block
				dialogPopUp(e1.getMessage());
			}

		});
		decreaseAltitude.addActionListener((ActionEvent e) ->
		{

			try {

				airplane.decreaseAltitude();
				checkAltitudeLevel(airplane.altitude);
				state_val.setText(airplane.state.toString());
				progressBar.setValue((int) (airplane.altitude));

				altitude_val.setText(Double.toString(airplane.altitude));;
			} catch (InvalidActionException e1) {
				// TODO Auto-generated catch block
				dialogPopUp(e1.getMessage());
			}

		});

	}
	private void setUpPanels() {
		stateAndAltitudeLabelPanel=new JPanel();
		stateAndAltitudeValLabelPanel=new JPanel();
		stateAndAltitudePanel=new JPanel();
		topPane=new JPanel();
		startStopPane=new JPanel();
		takeOffPane=new JPanel();
		contentPane=new JPanel();
		altitudeSetPane=new JPanel();
		buttonsPane=new JPanel();
		resultPane=new JPanel();
		contentPane=(JPanel)getContentPane();

		contentPane.setLayout(new BoxLayout(contentPane,BoxLayout.Y_AXIS));
		contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		stateAndAltitudePanel.setLayout(new BoxLayout(stateAndAltitudePanel,BoxLayout.Y_AXIS));
		stateAndAltitudePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));


		topPane.setLayout(new BoxLayout(topPane,BoxLayout.Y_AXIS));
		topPane.setBorder(BorderFactory.createEmptyBorder(90, 20, 20, 20));
		topPane.setBorder(BorderFactory.createLineBorder(Color.black));

		buttonsPane.setLayout(new BoxLayout(buttonsPane,BoxLayout.Y_AXIS));
		buttonsPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		resultPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		resultPane.setBorder(BorderFactory.createLineBorder(Color.black));
		progressBar.setBorder(BorderFactory.createLineBorder(Color.black));


	}
	private void addComponentsToPanels() {

		stateAndAltitudeLabelPanel.add(state);
		stateAndAltitudeLabelPanel.add(altitude);
		stateAndAltitudeValLabelPanel.add(state_val);
		stateAndAltitudeValLabelPanel.add(altitude_val);
		stateAndAltitudePanel.add(stateAndAltitudeLabelPanel);
		stateAndAltitudePanel.add(stateAndAltitudeValLabelPanel);

		topPane.add(stateAndAltitudePanel);
		topPane.add(progressBar);


		contentPane.add(topPane);

		startStopPane.add(start);
		startStopPane.add(stop);

		takeOffPane.add(takeOff);

		altitudeSetPane.add(increaseAltitude);
		altitudeSetPane.add(decreaseAltitude);

		buttonsPane.add(startStopPane);
		buttonsPane.add(takeOffPane);
		buttonsPane.add(altitudeSetPane);

		contentPane.add(buttonsPane);

		resultPane.add(message_label);
		resultPane.setPreferredSize(new Dimension(50,30));
		topPane.setPreferredSize(new Dimension(100,100));
		message_label.setHorizontalAlignment(message_label.CENTER);//setting the alignment of message_label to centre

		contentPane.add(resultPane);


	}
	private void dialogPopUp(String errorMsg) {
		JOptionPane.showMessageDialog(null, errorMsg);
	}
	private void checkAltitudeLevel(double altitudeValue) {
		if(airplane.altitude<10000) {
			message_label.setText("");

		}
		else if(airplane.altitude>=10000 && airplane.altitude<12000) {
			message_label.setText("DANGER AIRPLANE ALTITUDE IS/ABOVE 10000!!!");

		}
		else if(airplane.altitude>=12000) {
			message_label.setText("BOOM!");
		}

	}
}
