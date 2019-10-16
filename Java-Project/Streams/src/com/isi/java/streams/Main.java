package com.isi.java.streams;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		String path="C:/Users/mkotha/Desktop/Murali.txt";
		String dataPath="data.bin";
		TextFileWriter obj=new TextFileWriter(path);
		//obj.writeTextToFile();
		
		TextFileReader fReader=new TextFileReader(path);
		//fReader.readTextFromFie();
	
	
        DataFileWriter dataFileWriter=new DataFileWriter(dataPath);	
        DataFileReader dataFileReader=new DataFileReader(dataPath);
        
        dataFileWriter.writeDataTFile(12, 213.235, true, "Murali");
        dataFileWriter.writeIntArrayToFile(generateRandomArray(10));
        dataFileReader.readIntArrayFromFile();
        //dataFileReader.readFromDataFile();
        
        
	}
	public static double[] generateRandomArray(int size) {
		Random random=new Random(System.currentTimeMillis());
		double[] array=new double[size];
				for(int i=0;i<size;i++) {
					double d=Math.random();
					array[i]=d;
				}
	
	return array;}
	
}
