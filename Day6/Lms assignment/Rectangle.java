package com.anudeep.learning;

public class Rectangle {
	  double width,height;//Add a member variable width and height of type double.

	  public enum  Color     //● Create an enum Color with values RED, GREEN, BLUE
	  {
	     red,green,blue;
	  };
	  Color boxColor; //Create a member variable boxColor of type Color
	  public static void main(String args[])
	  {
	     System.out.println(Color.blue); //In main method just print the enum Color.BLUE
	  }
	}
