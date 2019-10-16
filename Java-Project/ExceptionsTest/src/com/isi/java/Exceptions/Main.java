package com.isi.java.Exceptions;

public class Main {

	private static void a() {
		System.out.println("a");
		b();

	}
	private static void b() {
		System.out.println("b");
		c();
	}
	private static void c() {
		System.out.println("C");

	}
	public static void main(String[] args) {
		System.out.println("main starting");
		a();
		System.out.println("main exiting");
	}
}
