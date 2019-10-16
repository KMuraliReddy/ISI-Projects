import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	public static void main(String[] args) {
		
	

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
}
}
