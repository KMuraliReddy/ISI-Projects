package com.isi.java.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextFileWriter {
	private String path;
	public TextFileWriter(String path) {
		this.path=path;
		
	}

	public void writeTextToFile() {
		//PrintWriter out=null;
		try (PrintWriter out=new PrintWriter(new File(path)))
		{
			//out=new PrintWriter(new File(path));
			out.println("Murali");
		} 
		catch (FileNotFoundException e) {

			e.printStackTrace();
		} 
		/*finally {//This will execute just before leaving the method with /without exception
			out.close();
		}*/
	}
}
