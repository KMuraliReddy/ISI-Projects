package com.isi.java.stringtest;
import java.util.Scanner;
public class StringRead 
{
/**
* An example program to read a String from console input in Java
*/


   public static void main(String[] args) {
       System.out.print("Enter a string : ");
       Scanner scanner = new Scanner(System. in);
       String inputString = scanner. nextLine();
       System.out.println("String read from console	 is : \n"+inputString);
   }
}


