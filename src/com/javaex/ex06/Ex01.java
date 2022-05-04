package com.javaex.ex06;

public class Ex01 {
	public static void main(String[]args) {
		
		String s01 = new String("안녕하세요");
		String s02 = new String("안녕하세요");
		
		System.out.println(s01.toString());
		System.out.println(s02.toString());
		
		System.out.println(s01==s02);
		
		System.out.println("=================");
		
		String s03 = "hi";
		String s04 = "hi";
		
		System.out.println(s03.toString());
		System.out.println(s04.toString());
		
		System.out.println(s03==s04);
	}
}
