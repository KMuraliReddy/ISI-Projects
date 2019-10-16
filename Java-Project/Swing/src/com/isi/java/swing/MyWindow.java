package com.isi.java.swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MyWindow extends JFrame {
	private JPanel contentPane;
	private JPanel buttonsPanel;

	private JButton okButton;
	private JButton submitButton;

	private JLabel myLabel;


	private JTextField myTextField;

	private JCheckBox checkBoxA;
	private JCheckBox checkBoxb;

	private JProgressBar progresBar;

	private JSlider slider;

	public MyWindow() {
		super("My Window");
		//dispose();

		createComponents();
		createPanels();
		addComponentsToPanels();
        addListenersToButtons();
        
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setSize(300,300);
		pack();//auto window size according to the elements
		setLocationRelativeTo(null);
		setVisible(true);

	}
	private void createComponents() {
		okButton = new JButton("OKAY");
		//okButton.setAlignmentX(0.5f);
		okButton.setHorizontalAlignment(SwingConstants.CENTER);
		submitButton =new JButton("Submit");
		myLabel =new JLabel("This is a label");
		myTextField =new JTextField("");
		checkBoxA =new JCheckBox("Option A", true);
		checkBoxb=new JCheckBox("Option B",false);
		progresBar=new JProgressBar(0,100);
		progresBar.setValue(-20);
		slider=new JSlider(-50,50);
		


	}
	private void createPanels() {
		buttonsPanel = new JPanel();
		contentPane=(JPanel)getContentPane();
		contentPane.setLayout(new BoxLayout(contentPane,BoxLayout.Y_AXIS));
		contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

	}
	private void addComponentsToPanels() {
		buttonsPanel.add(okButton);
		buttonsPanel.add(submitButton);
		contentPane.add(buttonsPanel);
		
		//contentPane.add(okButton);
		//contentPane.add(Box.createRigidArea(new Dimension(0,20)));//to give space between the elements in panel
		//contentPane.add(submitButton);
		contentPane.add(Box.createRigidArea(new Dimension(0,20)));
		contentPane.add(myLabel);
		contentPane.add(Box.createRigidArea(new Dimension(0,20)));
		contentPane.add(myTextField);
		contentPane.add(Box.createRigidArea(new Dimension(0,20)));
		contentPane.add(checkBoxA);
		contentPane.add(Box.createRigidArea(new Dimension(0,20)));
		contentPane.add(checkBoxb);
		contentPane.add(Box.createRigidArea(new Dimension(0,20)));
		contentPane.add(progresBar);
		contentPane.add(Box.createRigidArea(new Dimension(0,20)));
		contentPane.add(slider);

	}
	private void addListenersToButtons() {
		ActionListener listener=(ActionEvent e)->myLabel.setText(myLabel.getText()+" Murali");
		okButton.addActionListener(listener);
        submitButton.addActionListener((ActionEvent e)  -> showDialog());

	}  
	private void showDialog() {
		//JOptionPane.showInputDialog(this, "Warning", "Title ---", MessageType.WARNING);
		
	}


}
