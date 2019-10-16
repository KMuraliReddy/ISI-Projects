package com.java.isi.Tictoctoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.isi.Airplane.model.InvalidActionException;
import com.java.isi.Tictoctoe.View.TicTacToeWindow;

//import jdk.jfr.internal.test.WhiteBox;


public class TicTocToe extends JFrame{
	private static int playerId;
	private static int movesCount;
	private static char[][] board;
	private static  String message;
	private static String result;
	static Date date= new Date();
	static long time = date.getTime();
	
	

	int bordSizeGlobal;

	public static int getPlayerId() {
		return playerId;
	}

	public static void setPlayerId(int playerId) {
		playerId = playerId;
	}

	public static int getMovesCount() {
		System.out.println(movesCount);
		return movesCount;
	}

	public static void setMovesCount(int movesCount) {
		movesCount = movesCount;
	}

	public char[][] getBoard() {
		return board;
	}

	public static void setBoard(char[][] board) {
		board = board;
	}

	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		message = message;
		
	}

	

	
	
		/*public boolean isWin(JButton[][] buttons) {
		String arr[] = {"","","","",""};
		System.out.println(bordSizeGlobal+"boardGlobalsize");
		for(int i=0;i<bordSizeGlobal;i++) {
			for(int j=0;j<bordSizeGlobal;j++) {
				if(buttons[i][j].getText()!="") {
					arr[j]=buttons[i][j].getText();

				}
			}
			if(arr[0]==arr[1] && arr[1]==arr[2]) {
				System.out.println("game over");
				
				
				JOptionPane.showMessageDialog(this, "Game Over!!");
				reset(bordSizeGlobal,buttons);
				//TicTacToeWindow.count=0;
				return true;

			}
		}
		return false;
	}*/
	public void reset(int boardSize,JButton[][] buttons) {
		
		for(int row = 0; row<boardSize ;row++) {
			for(int column = 0; column<boardSize ;column++) {


				buttons[row][column].setText("");
			//	TicTacToeWindow.count=0;


			}
		}
	}
	// function to update the board model
	public static  void PlayMove(int x, int y) {
		System.out.println("Murali1");
		
		if(getMovesCount() > 0){
			System.out.println("Murali2");
			// mark the board with x or o depending on playerId
			if(playerId%2 != 0) 
				board[x][y] = 'X';
			else 
				board[x][y] = 'O';
			
			// reduce the count of moves left
			setMovesCount(--movesCount);
			
			// check if playerId has won or if game is tied,
			// and send message accordingly to view, also update the view
			if(isWinner(x, y)) {
				long time1 = date.getTime();
				long seconds = (time-time1)/1000;
			   
				setMessage("The Game Has Ended In " + seconds );
				String temp=String.valueOf(playerId);
				result="Player  "+temp+" is Winner!";
				TicTacToeWindow.isWinner(x, y, board[x][y], getMessage());
			}
			else if(getMovesCount()==0) {
				
				long time1 = date.getTime();
				long seconds = (time-time1)/1000;
			   System.out.println(seconds);
				setMessage("The Game Has Ended In " + seconds );
				//setMessage("No Winner! Game ended in a Tie");
				result="No Winner! Game ended in a Tie";
				try{      
					Socket s=new Socket("localhost",2222);  
					DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
					dout.writeUTF(result.toString());  
					
					dout.flush();  
					dout.close();  
					s.close();  
					}catch(Exception e1){System.out.println(e1);}
				TicTacToeWindow.isWinner(x, y, board[x][y], getMessage());
			}
			else {
				System.out.println("hello");
				if(playerId%2 != 0) {
					// toggle the playerId
					setPlayerId(2);
					setMessage("'O':  Player " +getPlayerId());
				}
				else {
					setPlayerId(1);
					setMessage("'X':  Player " +getPlayerId());

				}
				// update the board with message for next player
				TicTacToeWindow.update(x, y, board[x][y], getMessage());
			}
			
		}
		
	}
	public static boolean isWinner(int x, int y) {
		int countRow = 0;
		int countCol = 0;
		int countLDiag = 0;
		int countRDiag = 0;
		char symbol;
		if(getPlayerId() %2 !=0)
			symbol = 'X';
		else
			symbol = 'O';
		
		for(int i=0; i<board.length;i++) {
			if(board[x][i] == symbol)
				countRow++;
			if(board[i][y] == symbol)
				countCol++;
			if(board[i][i] == symbol)
				countRDiag++;
			if(board[board.length-1-i][i] == symbol)
				countLDiag++;	
		}
		
		if(countCol==board.length || countRow==board.length 
		   || countLDiag == board.length || countRDiag == board.length)
			return true;
		
		return false;
	}
	



}
