package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		
		Point p01 = new Point(2, 3);
		Point p02 = new Point(2, 3);
		Point p04 = p01;
		
		System.out.println(p01==p02); //주소비교
		
		System.out.println(p01.equals(p02)); // 논리비교
		
		System.out.println(p01 == p04); 
		System.out.println(p01.equals(p04));		
	}

}
