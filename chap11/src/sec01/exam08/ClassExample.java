package sec01.exam08;

import java.awt.CardLayout;

public class ClassExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// 1. Ŭ�����κ��� ��� ���

		Class clazz = Car.class;
		
		// 2. �� ��° ���
		// Class clazz = Class.forName("sec01.exam08.Car")
		
		// 3. �� ��° ���
		// Car car = new Car();
		// Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}

}
