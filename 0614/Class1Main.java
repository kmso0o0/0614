package org.java.oop;

public class Class1Main {

	public static void main(String[] args) {
		
		
		
		//�ν��Ͻ�ȭ(��üȭ)
		// new ��ü���� ������
		// c1 ��ü�� �ּ�
		// ��ü.	->��ü ���� ������
		Class1 cl=new Class1();
		//c1 -> num1, num2, key�� �ʱ�ȭ ��ȣ �ֿܼ� ��� 
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
		
		
		
		
		
		// Ŭ���� ��� -> �ν��Ͻ� ���� ���� ���,
		System.out.println(Class1.PROJECTNAME);
		Class1.classMethod();
		
		
		
	}
}
