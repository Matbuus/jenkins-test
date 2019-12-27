package com.proj;

public class Operations {

	
	
	public static float add(float a, float b) {
		return a+b;
	}
	
	public static float sub(float a, float b) {
		return a-b;
	}
	
	public static float mul(float a, float b) {
		return a*b;
	}
	
	public static float div(float a, float b) {
		return b==0?-1F:a/b;
	}
	
	
	
	public static void main(String[] args) {
	    System.out.println("Hello World!");
   }

}
