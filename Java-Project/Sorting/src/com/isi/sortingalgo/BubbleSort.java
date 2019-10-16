package com.isi.sortingalgo;



public  class BubbleSort extends AbstractSortedArray
{
	public BubbleSort(int size)
	{
		super(size);
	}
	public BubbleSort(int[] array )
	{
		super(array);
	}
	@Override
	public void sort()
	{
		int t=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=1;j<array.length-i;j++)
			{
				if(array[j-1]>array[j])
				{
					t=array[j-1];
					array[j-1]=array[j];
					array[j]=t;
				}
			}
		}



	} 
}
