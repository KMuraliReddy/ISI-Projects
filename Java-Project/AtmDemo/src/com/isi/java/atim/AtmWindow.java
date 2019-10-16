package com.isi.java.atim;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
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
import com.isi.java.atim.Account;

public class AtmWindow extends JFrame {


	private JPanel contentPane;

	private JLabel balance;
	private JLabel amount;
	private JLabel noTrans;

	private static JTextField textField;

	private JButton deposit;
	private JButton withdrawl;
	private JButton exit;

	public AtmWindow() {
		super("ATM");
		Account acc=new Account();

		createComponents();
		createPanels();
		addListenersToButtons();
		addComponentsToPanels();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();//auto window size according to the elements
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);

		//   addListenersToButtons();


	}

	private void addListenersToButtons() {

		withdrawl.addActionListener((ActionEvent e) ->
		{
			if(isDouble(textField.getText())) {
				Account.withdraw(Double.parseDouble(textField.getText()));
			}
			else {
				insufficientFunds();
			}
		});

		deposit.addActionListener((ActionEvent e) ->
		{
			if(isDouble(textField.getText())) {
				Account.deposit(Double.parseDouble(textField.getText()));
			}
			else {
				insufficientFunds();
			}

		});
		exit.addActionListener((ActionEvent e)-> System.exit(0));
	}

	private void addComponentsToPanels() {
		// TODO Auto-generated method stub
		for(int i=0;i<(1*7);i++) {
			//contentPane.add(new JButton(Integer.toString(i)));
			switch(i){
			case 0:
				contentPane.add(balance);
				break;
			case 1:	
				contentPane.add(amount);
				break;
			case 2:	
				contentPane.add(textField);
				break;
			case 3: 
				contentPane.add(deposit);
				break;
			case 4: 
				contentPane.add(withdrawl);
				break;
			case 5: 
				contentPane.add(exit);
				break;
			case 6:
				contentPane.add(noTrans);
				break;

			}
		}

	}

	private void createPanels() {
		// TODO Auto-generated method stub
		contentPane=(JPanel)getContentPane();
		contentPane.setLayout(new GridLayout(7, 1, 0, 10));
		contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

	}

	private void createComponents() {
		// TODO Auto-generated method stub
		balance = new JLabel("Balance");
		amount =new JLabel("$0.00");
		textField =new JTextField("");
		deposit =new JButton("Deposit");
		withdrawl =new JButton("Withdrawal");
		exit =new JButton("Exit");
		noTrans=new JLabel("No Transaction Performed");

	}
	public static void insufficientFunds() {
		JOptionPane.showMessageDialog(null,  "Insufficient funds/Error");
		textField.setText("");
	}
	public static void sucessMessage(String transType) {
		JOptionPane.showMessageDialog(null, "Succesful"+transType+ " Current Balanace : "+Account.getBalance());
		textField.setText("");

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
