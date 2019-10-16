package com.isi.java.TicTacToe_Project.View;

import java.util.Scanner;



public class TicTacToeConsole  {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		int boardChoice = 0;
		int modeChoice = 0;
		
			

		while(true)
		{
		
			System.out.println("Choose One Option From The Below");
			System.out.println("1 – 3*3\n2 - 4*4\n3 - 5*5");
			boardChoice = sc.nextInt();
		
				switch(boardChoice)
				{
				case 1:
					new TicTacToeWindow(3,chooseMode());
					break;
				case 2 :
					new TicTacToeWindow(4,chooseMode());
					break;
				case 3:
					new TicTacToeWindow(5,chooseMode());
					break;
				}
				
					

				}
				/*System.out.println("Choose Game Mode");
				System.out.println("1 - User and AI\n2 - Multiple users on one computer\n3 - Multiple users on network\n4 - Exit ");
				modeChoice=sc.nextInt();
				switch(modeChoice) {
				case 4:
					exit();
					break;
				
				}*/
				
				
		

	}
	private static int chooseMode() {
		int modeChoice=0;
	
		while(true) {
			System.out.println("1 - User and AI\n2 - Multiple users on one computer\n3 - Multiple users on network\n4 - Exit ");
			
			modeChoice=sc.nextInt();
			switch(modeChoice) {
			case 1:
				return 1;
				
			case 2:
				return 2;
			case 3:
				return 3;
			}
		}
		
	}

	private static void exit() {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}
}
