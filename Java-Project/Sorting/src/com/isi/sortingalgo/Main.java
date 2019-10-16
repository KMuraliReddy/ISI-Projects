package com.isi.sortingalgo;



//import java.util.Random;

public class Main
{
	public static void main(String[] args)
	{
		/*int[] bubbleArray=AbstractSortedArray.generateRandomArray(4);


		int[] selectionArray=AbstractSortedArray.generateRandomArray(4);

		BubbleSort bubble= new BubbleSort(bubbleArray);
		SelectionSort selection = new SelectionSort(selectionArray);
		bubble.timesort();
		bubble.display();
		System.out.println("The Average Value Of The Array Is : "+selection.average(bubbleArray));
		System.out.println("The Max Value Of The Array Is : "+selection.max(bubbleArray));
		System.out.println("The Min Value Of The Array Is : "+selection.min(bubbleArray));
		selection.timesort();
		selection.display();
		System.out.println("The Average Value Of The Array Is : "+selection.average(selectionArray));
		System.out.println("The Max Value Of The Array Is : "+selection.max(selectionArray));
		System.out.println("The Min Value Of The Array Is : "+selection.min(selectionArray));
		 */
		int size=1500;
		double bubble_average=0;
		double selection_average=0;
		double insertion_average=0;


		for(int i=0;i<100;i++) {
			DynamicSorting dynamic=new DynamicSorting(size);
			dynamic.setSorter(SortingAlgorithems.BubbleSorter);
			dynamic.setRandomArray(size);
			bubble_average=bubble_average+dynamic.timesort();
			dynamic.setSorter(SortingAlgorithems.SelectionSorter);
			dynamic.setRandomArray(size);
			selection_average=selection_average+dynamic.timesort();
			dynamic.setSorter(SortingAlgorithems.InsertionSorter);
			dynamic.setRandomArray(size);
			insertion_average=insertion_average+dynamic.timesort();
		}
		System.out.println(bubble_average/100);
		System.out.println(selection_average/100);
		System.out.println(insertion_average/100);
	}
}

