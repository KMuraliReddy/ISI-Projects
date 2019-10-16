package com.isi.java.streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DataFileWriter {
	private String path;
	public DataFileWriter(String path) {
		this.path=path;
	}
	public void writeDataTFile(int i,double d,boolean b,String s) {
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(path))){

			out.writeInt(i);
			out.writeDouble(d);
			out.writeBoolean(b);
			out.writeUTF(s);
			System.out.println(out.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void writeIntArrayToFile(double[] a) 
	{

		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(path)))
		{

			int size=a.length;
			out.writeInt(size);
			for(int i=0;i<size;i++) {
				out.writeDouble(a[i]);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
