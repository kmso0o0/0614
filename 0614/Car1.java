package org.java.oop;

public class Car1 {
	
	//���
	//�ν��Ͻ� ���(�ʵ�)
	public String carName;
	public int carCoin;
	public int carYear;
	public int carWidth;
//	final ����� ������ ���ÿ� �ʱ�ȭ �ؾߵȴ�. ���� �Ұ�
//	public static String CITY="����";
	public static String CITY;
	
	
	//private setter, getter �޼��� ����
	private String option1;
	private String option2;
	
	//setters -> private ��� �ʱ�ȭ
	public void setOption1(String option) {
		this.option1=option1;
	}
	// getters -> private ��� get
	public String getOption1() {
		return this.option1;
	}
	public void setOption2(String option2) {
		this.option1=option2;
	}
	// getters -> private ��� get
	public String getOption2() {
		return this.option2;
	}
	
	
	
	//�ν��Ͻ� ��� (�޼���)
	public void instancMethod1() {
		System.out.println("������̸�:"+this.carName);
	}
	//�ν��Ͻ� ��� (�޼���)
	public void instancMethod2() {
		System.out.println("����ڰ���:"+this.carCoin);
	}
	//�ν��Ͻ� ��� (�޼���)
	public void instancMethod3() {
		System.out.println("����ڳ��:"+this.carYear);
	}
	//�ν��Ͻ� ��� (�޼���)
	public void instancMethod4() {
		System.out.println("����ڳ���:"+this.carWidth);
	}
	
	
}
