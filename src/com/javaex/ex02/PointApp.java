package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p00 = new Point(3, 5);
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		Point p03 = p02;
		
		//System.out.println(p01.getX());
		
		//Point클래스의 부모로 object클래스를 자동으로 상속한다.
		
		//클래스 정보 보기
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		
		System.out.println("==============================");
		
		//인스턴스의 정보 보기 -> Point의 toString() 재정의 전후 비교
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		
		//메모리의 주소 값에 대응되는 중복되지 않은 값
		System.out.println("==============================");
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		
		
		System.out.println("==============================");
		System.out.println(p01.equals(p02));
		System.out.println(p02.equals(p01));
		
		System.out.println(p01.equals(p01));
		System.out.println(p02.equals(p03));
		
		System.out.println("==============================");
		System.out.println("== // equals() 차이점");
		// == 변수의 값이 같은가
		System.out.println(p00.equals(p01));
	}

}
