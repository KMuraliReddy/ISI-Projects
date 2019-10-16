package com.isi.sortingalgo;

public class SortingAlgorithems {

	public static final ISorter BubbleSorter;
	public static final ISorter SelectionSorter;
	public static final ISorter InsertionSorter;
	static {
		SelectionSorter =new ISorter() {
			
			@Override
			public void sort(int[] array) {
				// TODO Auto-generated method stub
				int n = array.length;
				for (int i = 0; i < n-1; i++)
				{
					int min_idx = i;
					for (int j = i+1; j < n; j++)
						if (array[j] < array[min_idx])
							min_idx =j;
					int temp = array[min_idx];
					array[min_idx] = array[i];
					array[i] = temp;
				}
				
			}
		};
		InsertionSorter =new ISorter() {
			
			@Override
			public void sort(int[] array) {
				// TODO Auto-generated method stub
				int n = array.length; 
				for (int i = 1; i < n; ++i) { 
					int key = array[i]; 
					int j = i - 1; 
					while (j >= 0 && array[j] > key) { 
						array[j + 1] = array[j]; 
						j = j - 1; 
					} 
					array[j + 1] = key; 
				} 
				
			}
		};
		BubbleSorter=new ISorter() {
			
			@Override
			public void sort(int[] array) {
				// TODO Auto-generated method stub
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
		};
	};
}
	}
