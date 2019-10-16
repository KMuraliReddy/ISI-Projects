package com.isi.sortingalgo;

public class InsertionSort extends AbstractSortedArray {

	public InsertionSort(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}
	public InsertionSort(int[] array) {
		super(array);
	}
	@Override
	public void sort() {
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

}
