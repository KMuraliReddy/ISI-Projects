package com.isi.java.shape;

import java.util.Random;



public class Main {
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(10,20);
		Triangle triangle=new Triangle(10,20);
		Circle circle=new Circle();

		Shape shaper=(Shape)rectangle;
		Shape shapec=(Shape)circle;
		Shape shapet=(Shape)triangle;

		Shape[] shapeArray=new Shape[3];
		shapeArray[0]=shaper;
		shapeArray[1]=shapec;
		shapeArray[2]=shapet;


		/*for(Shape shape : shapeArray) {

			shape.display();
		}*/
		Shape[] shapes=new Shape[100];
		Random random=new Random();
		for(int i=0;i<shapes.length;i++) {
			int max=2,min=0;

			int r=(int) ((Math.random()*((max-min)+1))+min);
			switch(r) {
			case 0 :
				shapes[i]=new Rectangle(random.nextInt(100) + 1, random.nextInt(100) + 1);
				break;
			case 1: 
				shapes[i]=new Circle(random.nextInt(100)+1);
				break;
			case 2:
				shapes[i]=new Triangle(random.nextInt(100) + 1, random.nextInt(100) + 1);
			}
			Shape t;
			for(int z=0;z<shapes.length;z++)
			{
				for(int j=1;j<shapes.length-z;j++)
				{
					if(shapes[j-1].compareTo(shapes[j]))//todo code
					{
						t=shapes[j-1];
						shapes[j-1]=shapes[j];
						shapes[j]=t;
					}
				}
			
		}


		}

		for(int i=0;i<shapes.length;i++) {
			shapes[i].compareTo(shapes[i]);
		}
	

		Rectangle r=new Rectangle();
		Comparable<Shape> c=(Comparable<Shape>)r;
	}

}
