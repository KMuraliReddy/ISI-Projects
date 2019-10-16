package com.isi.sortingalgo;


import java.util.Random;

public abstract class AbstractSortedArray 
{
	protected int[] array;
	boolean sorted=false;
	public void setArray(int[] array) {
	this.array=array;
    sorted = false;
	
	}
	public void setRandomArray(int size) {
		this.array=generateRandomArray(size);
		
	}
	
	public AbstractSortedArray(int size)
	{
		this.array = generateRandomArray(size);  

	}
	public AbstractSortedArray(int[] array)
	{
		this.array=array;


	}
	public int getElement(int index)
	{
		return array[index];
	}

	public void setElement(int index,int value)
	{
		array[index]=value;
	}

	public int getSize()
	{
		return array.length;
	}
	public void display()
	{
		String arrayString = this.getClass().getSimpleName()+":\t";
		for(int i=0;i<array.length;i++)
		{
			arrayString += array[i];
			if(i<array.length-1)
				arrayString +=" ,   ";
		}

		arrayString = "(  " +arrayString +  ")";

		System.out.println(arrayString);
	}
	public double average(int arr[])
	{
		double sum=0;
		for (int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}

		return sum/arr.length;
	}
	public int min(int arr[])
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	public int max(int arr[])
	{
		int max=arr[0];  
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {			  
				max=arr[i];
			}
			else {
				max=arr[arr.length-1];
			}
		}
		return max;
	}

	public double timesort()
	{
		long initialTime= System.currentTimeMillis();
		sort();
		long finalTime =System.currentTimeMillis();
		long deltaTime=finalTime-initialTime;
		System.out.println("Array Sorted in : "+deltaTime);
		return deltaTime;
	}
	//ABSTRACT METHOD
	public abstract void sort();

	//STATIC


	public static int[] generateRandomArray(int size)
	{
		int[] randomArray =new int[size];

		Random random = new Random(System.currentTimeMillis());
		random.nextInt(1001);

		for(int i=0;i<randomArray.length;i++)
		{
			randomArray[i]=random.nextInt(1001);
		}


		//iterate through array,

		return randomArray;

	}
}
