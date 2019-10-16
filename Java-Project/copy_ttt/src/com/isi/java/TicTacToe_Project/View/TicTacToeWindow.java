package com.isi.java.TicTacToe_Project.View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import com.isi.java.TicTacToe_Project.Model.TicTacToeModel;



public class TicTacToeWindow implements ITicTacToeWindow{
	
	private TicTacToeModel actionListener;
	//private Adapter adapter;
	private JFrame gui;
    private JButton[][] blocks;
    private JButton reset;
    private JTextArea playerturn;
    public int count=0;
    
    public  TicTacToeWindow() {
		// TODO Auto-generated constructor stub
    	this.gui = new JFrame("Tic Tac Toe");
		this.blocks = new JButton[3][3];
		this.reset = new JButton("Reset");
		this.playerturn = new JTextArea();
		// call the initialize method to set up the layout and initialize buttons
		initialize();
	}
	@Override
	public void createBoard(int boardSize) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setActionListenersToButtons(int boardSize) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMove() {
		// TODO Auto-generated method stub
		
	}

}
