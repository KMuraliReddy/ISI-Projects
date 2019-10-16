package com.isi.java.shape;

public class Triangle extends Shape {

	private double base,height;

	public Triangle() {

		this(15,20);

	}

	public Triangle(double base,double height) {

		this.base=base;
		this.height=height;

	}
	public void setBase(double base) {

		this.base=base;

	}

	public void height(double height) {

		this.height=height;

	}

	public double getBase(double base) {

		return base;

	}

	public double getHeight(double height) {

		return height;

	}

	@Override
	public double getArea() {

		return (base*height)/2;

	}
	@Override
	public void display() {

		super.display();
		System.out.println("Base and Height Of Trianle Are : "+base+" : "+height);

	}

}
