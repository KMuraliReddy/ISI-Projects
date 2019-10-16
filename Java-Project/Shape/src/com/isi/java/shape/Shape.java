package com.isi.java.shape;

public abstract class Shape  implements Comparable<Shape>{

	public abstract double getArea();
	public int i=0;

	public void display() {

		System.out.println("The Area Of The " + toString() +" Is : "+getArea());

	}
	@Override
	public String toString() {

		return this.getClass().getSimpleName();

	}
	@Override
	public int compareTo(Shape shape) {
		
		double thisArea=this.getArea();
		double area_of_shapes=shape.getArea();
		System.out.println(thisArea+" :: "+area_of_shapes);
		
		
		if(thisArea>area_of_shapes) {
			return 1;
		}
		 else if (thisArea<area_of_shapes){
			return-1;
		}
		 else {
			return 0;
		}
		
	}
}
