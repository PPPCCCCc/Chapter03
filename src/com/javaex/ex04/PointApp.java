package com.javaex.ex04;

public class PointApp {
	public static void main(String[] args) {
	
	Point p01 = new Point(2, 3);
	Point p02 = new Point(3, 3);
	Point p03 = p01;
	
	System.out.println(p01==p02);
	System.out.println(p03==p01);
	}
}
