package org.java.oop;

public class Car1Main {

	public static void main(String[] args) {
		
		Car1.CITY="서울";
		
		// aCar -> 객체참조변수(생성된 객체의 주소값) -> 객체
		// new  객체생성 연산자
		// 클래스 -> 사용자 정의 타입
		Car1 aCar=new Car1();
		Car1 aCar1=new Car1();
		Car1 aCar2=new Car1();
		
		System.out.println(aCar1.equals(aCar2));
		System.out.println(aCar1);
		System.out.println(aCar2);
		
		System.out.println(aCar1.getClass());
		System.out.println(aCar2.getClass());
		
		System.out.println(aCar.CITY);
		
		int i=10;
		
		
		aCar.instancMethod1();
		//객체의 기본 값은 null
		aCar.carName="ACar";
		aCar.carCoin=10000;
		aCar.carYear=2020;
		aCar.carWidth=150;
		
		aCar.toString();
		aCar.instancMethod1();
		aCar.instancMethod2();
		aCar.instancMethod3();
		aCar.instancMethod4();
		//private 멤버 setter
		aCar.setOption1("자동");
		aCar.setOption2("옵션2");
		
		//private 멤버 getter
		//메서드의 return값은 호출(call)한 곳에 return된다.
		System.out.println(aCar.getOption1());//
		String option1=aCar.getOption1();
		System.out.println(option1);//
		aCar.getOption2();
		
		//private 멤버 getter
		
		//bCar
		Car1 bCar=new Car1();
		System.out.println(bCar.CITY);
		
		bCar.instancMethod1();
		//객체의 기본 값은 null
		bCar.carName="BCar";
		bCar.carCoin=10000;
		bCar.carYear=2020;
		bCar.carWidth=150;
		
		
		bCar.instancMethod1();
		bCar.instancMethod2();
		bCar.instancMethod3();
		bCar.instancMethod4();
		
		//cCar
		Car1 cCar=new Car1();
		System.out.println(cCar.CITY);
		
		cCar.instancMethod1();
		//객체의 기본 값은 null
		cCar.carName="CCar";
		cCar.carCoin=10000;
		cCar.carYear=2020;
		cCar.carWidth=150;
		
		
		cCar.instancMethod1();
		cCar.instancMethod2();
		cCar.instancMethod3();
		cCar.instancMethod4();
		
		//dCar
		Car1 dCar=new Car1();
		System.out.println(dCar.CITY);
		
		dCar.instancMethod1();
		//객체의 기본 값은 null
		dCar.carName="DCar";
		dCar.carCoin=10000;
		dCar.carYear=2020;
		dCar.carWidth=150;
		
		
		dCar.instancMethod1();
		dCar.instancMethod2();
		dCar.instancMethod3();
		dCar.instancMethod4();
		
		
	}
}
