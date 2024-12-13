package com.withinSameClass;

public class Demo {
	
	public Demo() {
		this(10);
		System.out.println("This is default constructor");
	}
	
	public Demo(String str) {
		System.out.println("This is String type constructor");
	}
	
	public Demo(int a) {
		this("Ram");
		System.out.println("This is int type constructor");
	}
	
	
	public static void main(String[]args) {
		Demo demo=new Demo();
	}
	

}
