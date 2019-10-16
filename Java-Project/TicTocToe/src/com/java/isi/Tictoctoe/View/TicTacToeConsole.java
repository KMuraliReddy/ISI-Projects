package com.java.isi.Tictoctoe.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;

public class TicTacToeConsole {

	
	static Scanner sc=new Scanner(System.in);
	public static int boardChoice = 0;
	public static void main(String[] args) {

		
		
		int modeChoice = 0;
		
			

		while(true)
		{
		
			System.out.println("Choose One Option From The Below");
			System.out.println("1 – 3*3\n2 - 4*4\n3 - 5*5");
			boardChoice = sc.nextInt();
		
				switch(boardChoice)
				{
				case 1:
					new TicTacToeWindow();
					
					break;
				case 2 :
					new TicTacToeWindow();
					break;
				case 3:
					new TicTacToeWindow();
					break;
				}
				
					

				}
			
				
				
		

	}
	

	private static void exit() {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}
	

}
