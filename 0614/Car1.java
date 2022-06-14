package org.java.oop;

public class Car1 {
	
	//멤버
	//인스턴스 멤버(필드)
	public String carName;
	public int carCoin;
	public int carYear;
	public int carWidth;
//	final 상수는 생성과 동시에 초기화 해야된다. 변경 불가
//	public static String CITY="서울";
	public static String CITY;
	
	
	//private setter, getter 메서드 생성
	private String option1;
	private String option2;
	
	//setters -> private 멤버 초기화
	public void setOption1(String option) {
		this.option1=option1;
	}
	// getters -> private 멤버 get
	public String getOption1() {
		return this.option1;
	}
	public void setOption2(String option2) {
		this.option1=option2;
	}
	// getters -> private 멤버 get
	public String getOption2() {
		return this.option2;
	}
	
	
	
	//인스턴스 멤버 (메서드)
	public void instancMethod1() {
		System.out.println("사용자이름:"+this.carName);
	}
	//인스턴스 멤버 (메서드)
	public void instancMethod2() {
		System.out.println("사용자가격:"+this.carCoin);
	}
	//인스턴스 멤버 (메서드)
	public void instancMethod3() {
		System.out.println("사용자년식:"+this.carYear);
	}
	//인스턴스 멤버 (메서드)
	public void instancMethod4() {
		System.out.println("사용자나이:"+this.carWidth);
	}
	
	
}
