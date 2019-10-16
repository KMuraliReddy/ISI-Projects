package com.java.isi.Tictoctoe.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.java.isi.Tictoctoe.TicTocToe;


public class TicTacToeWindow extends JFrame implements ActionListener {
	//new
	private JFrame UI;
	private static JButton[][] gridButtons;
	private static JButton resetButton;
	private static JTextArea playerID;
	private int count=0;
	
	//TicTocToe tictactoe=new TicTocToe();
	

	public TicTacToeWindow() {
		
		this.UI=new JFrame("TIC TAC TOE");
		this.gridButtons=new JButton[3][3];
		this.resetButton=new JButton("Reset");
		this.playerID=new JTextArea();
		createBoard(3);
		
		}
	public void createBoard(int boardSize) {
		
		UI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    UI.setResizable(true);
	    JPanel gamePanel = new JPanel(new FlowLayout());
	    JPanel game = new JPanel(new GridLayout(boardSize,boardSize));
	    System.out.println(game.getSize());
	    gamePanel.add(game, BorderLayout.CENTER);
	    JPanel optionsPanel = new JPanel(new FlowLayout());
	    optionsPanel.add(resetButton);
	    JPanel messagePanel = new JPanel(new FlowLayout());
	    messagePanel.setBackground(Color.GRAY);
	    UI.add(gamePanel, BorderLayout.NORTH);
	    UI.add(optionsPanel, BorderLayout.CENTER);
	    UI.add(messagePanel, BorderLayout.SOUTH);
	    messagePanel.add(playerID);
	    
	    playerID.setText("Player 1 to play 'X'");
	    System.out.println(Toolkit.getDefaultToolkit().getScreenSize());
	    for(int row = 0; row<boardSize ;row++) {
	        for(int column = 0; column<boardSize ;column++) {
	        	gridButtons[row][column] = new JButton();
	        	gridButtons[row][column].setPreferredSize(new Dimension(75,75));
	        	gridButtons[row][column].setText("");
	        	gridButtons[row][column].addActionListener(this);
	            game.add(gridButtons[row][column]);
	            
		    }
		}
	    
	    UI.setVisible(true);
	    int width=(int)game.getSize().getWidth();
	    int height=(int)game.getSize().getHeight();
	    UI.setSize(new Dimension(width+275,height+125 ));//Setting Jframe , width and height dynamicully according to the board size 


	}

/*	private void createPanels(int dimension1,int dimension2) {
		// TODO Auto-generated method stub
		contentPane=(JPanel) getContentPane();
		gamePanel=new JPanel();
		messagePanel=new JPanel();
		resetPanel=new JPanel();

		contentPane.setLayout(new BoxLayout(contentPane,BoxLayout.Y_AXIS));
		contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		GridLayout gridLayout=new GridLayout(dimension1, dimension2);
		gamePanel.setLayout(new GridLayout(dimension1, dimension2));
		//gamePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		//gamePanel.setLayout(new BoxLayout(gamePanel,BoxLayout.Y_AXIS));
		//	gridLayout.get

		messagePanel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		messagePanel.setLayout(new BoxLayout(messagePanel,BoxLayout.Y_AXIS));


		resetPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		resetPanel.setLayout(new BoxLayout(resetPanel,BoxLayout.Y_AXIS));
		//	contentPane.add(reSet,BorderLayout.SOUTH);

	}
	public void addCompomemtsToPanels() {

		//messagePanel.add(playerTurn);
		resetPanel.add(reSet);

		contentPane.add(gamePanel);
		contentPane.add(messagePanel);
		contentPane.add(resetPanel);

	}
	public ArrayList<Integer> setActionListenersToGridButtons(int boardSize) {
		int temp=0;
		ArrayList<Integer> coOrdinates = new ArrayList<Integer>();
		resetButton.addActionListener((ActionEvent e) ->
		{

			

		});
		
		for(int i=0;i<boardSize;i++) {
			
		
			for(int j=0;j<boardSize;j++) {
				gridButtons[i][j].addActionListener((ActionEvent e) -> {
					coOrdinates.add(i);
					coOrdinates.add(j);

				});
			}
		}
		return coOrdinates;
	}
	/*public  void createComponents(int dimension) {
		// TODO Auto-generated method stub


		for(int row = 0; row<dimension ;row++) {
			for(int column = 0; column<dimension ;column++) {
				buttons[row][column] = new JButton();
				buttons[row][column].setPreferredSize(new Dimension(75,75));
				//buttons[row][column].setText("");
				buttons[row][column].setName(row+":"+column);
				gamePanel.add(buttons[row][column]);

			}
		}
		setVisible(true);

	}*/
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ArrayList<Integer> coOrdinates=new ArrayList<Integer>();
		 Object source = e.getSource();
	        for(int i = 0;i< gridButtons.length; i++){
	            for(int j = 0;j < gridButtons.length;j++){
	                if(source == gridButtons[i][j]){
	                    JButton clicked = gridButtons[i][j];
	                    coOrdinates.add(i);
	                    coOrdinates.add(j);
	                    System.out.println(i+""+j);
	                    TicTocToe.PlayMove(i,j);
	                }
	            }
	        }
	}
    public static  void isWinner(int row, int column, char symbol, String message) {
    	gridButtons[row][column].setText(Character.toString(symbol));
		gridButtons[row][column].setEnabled(false);
		for(int i = 0; i<3 ;i++) {
	        for(int j = 0; j<3 ;j++) {
	        	gridButtons[i][j].setEnabled(false);
	        }
		}
		playerID.setText(message);

    }
    
    
    public static void update(int row, int column, char symbol, String message) {
    	gridButtons[row][column].setText(Character.toString(symbol));
    	gridButtons[row][column].setEnabled(false);
		playerID.setText(message);
		
	
}
	

}
