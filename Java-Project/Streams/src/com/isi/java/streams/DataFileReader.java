package com.isi.java.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;



public class DataFileReader {
	String path;
	public DataFileReader(String path) {
		this.path=path;
	}
	public void readFromDataFile() {
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(path))){
			int i=in.readInt();
			double d=in.readDouble();
			boolean b=in.readBoolean();
			Thread.sleep(1000);
			String s=in.readUTF();
			Thread.sleep(1000);
			System.out.println(i);
			Thread.sleep(1000);
			System.out.println(d);
			Thread.sleep(1000);
			System.out.println(b);
			Thread.sleep(1000);
			System.out.println(s);
		}
		catch(IOException | InterruptedException e){
			e.printStackTrace();
		}
	}
	public void readIntArrayFromFile() {
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(path))){
			int size=in.readInt();
			double[] array=new double[size];
			
			for(int i=0;i<size;i++) {
				double d1=array[i];
				System.out.println(d1);
			}
			
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
