package tictoctoe;
import model.*;

import view.*;
import controller.*;
import java.awt.event.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

import javax.swing.JButton;

public class TicTacToe implements ActionListener  {                                                              
                               
	private Controller c;
	private View v;
	
	// initializing the references of the controller and view classes
    public TicTacToe(Controller c, View v) {
    	
    	this.c = c;
        this.v = v;
        
    }
    
    
    
    public void actionPerformed(ActionEvent e) {
    	
    	
    	//Get streamdata from wifi to jswing window
    	/*
    	System.out.println(e);
    	System.out.println("1");	
    	String str=e.toString();
    	
    	System.out.println(str);
    	try{  
    		System.out.println("2");
    		ServerSocket ss=new ServerSocket(2222);  
    		Socket s=ss.accept();//establishes connection   
    		System.out.println("3");
    		DataInputStream dis=new DataInputStream(s.getInputStream());  
    		System.out.println(dis.toString()+"this is dis");
    		String  str1=(String)dis.readUTF();  
    		System.out.println("message= "+str1);  
    		ss.close();  
    	}catch(Exception e2){System.out.println(e2);} 
    	*/
		// actionListener asks the controller to perform desired action based on the button pressed
    	
    	
		if(v.isReset(e))
			c.setRequest();
		else {
			ArrayList<Integer> position = v.getPosition(e);
		//	System.out.println(position);
			c.setRequest(position);
		}
}
    public static void main(String[] args) {                                   
        // Create the components     
        
    		Controller c = new Controller();  
    		View v = new View();   
        Model m = new Model();   
       
        // Use aggregation to put the components together
        
        m.registerView(v);
     
        c.setModel(m);
        System.out.println(c);
   
        v.setActionListener(c);
        
    }


}
 