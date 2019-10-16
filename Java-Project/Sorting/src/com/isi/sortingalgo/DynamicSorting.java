package com.isi.sortingalgo;

public class DynamicSorting extends AbstractSortedArray {

	private ISorter sorter=SortingAlgorithems.InsertionSorter;
	public DynamicSorting(int size) {
		super(size);
		
		
	}

	public DynamicSorting(int arr[]) {
		super(arr);
	}
public void setSorter(ISorter sorter) {
	this.sorter=sorter;
}
	@Override
	public void sort() {

		sorter.sort(array);
	}

}
