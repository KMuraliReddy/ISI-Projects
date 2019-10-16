package com.isi.java.streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.IIOException;

public class TextFileReader {
	private String path;
	public  TextFileReader(String path) {
		// TODO Auto-generated constructor stub
		this.path=path;
	}
	public String readTextFromFie() {
		String text="";
		try(BufferedReader in=new BufferedReader(new FileReader(path))){
			String line;
			
			Thread.sleep(1000);
			while((line=in.readLine())!=null) {
				text+=line;
				System.out.println(line);
				Thread.sleep(1000);
			}
		line=in.readLine();
			
		}
		catch (IOException | InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return text;
	}

}
