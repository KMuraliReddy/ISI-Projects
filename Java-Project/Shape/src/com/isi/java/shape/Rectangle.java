package com.isi.java.shape;

public class Rectangle extends Shape {

	private double length,width;

	public Rectangle() {

		this(10,10);

	}

	public Rectangle(double length,double width){

		this.length=length;
		this.width=width;

	}

	public void setLegth(double length) {

		this.length=length;

	}

	public void setWidth(double width) {

		this.width=width;

	}

	public double getLength(double length) {

		return length;

	}

	public double getWidth(double width) {

		return width;

	}


	@Override
	public double getArea() {

		return length*width;

	}

	@Override
	public void display() {

		super.display();
		System.out.println("The Length And Width Of The Rectangle Are : "+length + " : "+width);

	}

}
