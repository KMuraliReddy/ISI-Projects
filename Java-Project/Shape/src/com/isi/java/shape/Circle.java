package com.isi.java.shape;



public class Circle extends Shape {

	private double radius;

	public Circle() {

		this(5);

	}

	public Circle(double radius) {

		this.radius=radius;

	}
	public void setRadius(double radius) {

		this.radius=radius;

	}

	public double getRadius(double radius) {

		return radius;

	}

	@Override
	public double getArea() {

		return Math.PI * Math.pow(radius, 2);

	}
	@Override
	public void display() {

		super.display( );
		System.out.println("Radius Of The Circle Is : "+radius);
	}

}
