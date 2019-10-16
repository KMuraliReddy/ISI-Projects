package com.isi.java.exceptions;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
ArrayList<Integer> numbers=new ArrayList<Integer>();

for(int i=0;i<20;i++) {
	numbers.add((2*i)+1);

}
for(int i=0;i<20;i++) {
	if(i%2==0)
		numbers.set(i,null);
}
for(int i=0;i<25;i++) {
	String numberString=numbers.get(i).toString();
System.out.println(numberString);	
}
	}

}
