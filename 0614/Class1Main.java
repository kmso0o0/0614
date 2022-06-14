package org.java.oop;

public class Class1Main {

	public static void main(String[] args) {
		
		
		
		//인스턴스화(객체화)
		// new 객체형상 연산자
		// c1 객체의 주소
		// 객체.	->객체 접근 연산자
		Class1 cl=new Class1();
		//c1 -> num1, num2, key를 초기화 가호 콘솔에 출력 
		cl.num1=100;
		cl.num2=200;
		cl.setkey("key2");
		
		System.out.println(cl.num1);
		System.out.println(cl.num2);
		System.out.println(cl.getkey());//private getters
		
		Class1 c2=new Class1();
		c2.num1=200;
		c2.num2=1000;
		c2.setkey("key3");
		
		System.out.println(c2.num1);
		System.out.println(c2.num2);
		System.out.println(c2.getkey());//private getters
		
		System.out.println(cl.equals(c2));
		
		
		
		
		
		// 클래스 멤버 -> 인스턴스 생성 없이 사용,
		System.out.println(Class1.PROJECTNAME);
		Class1.classMethod();
		
		
		
	}
}
