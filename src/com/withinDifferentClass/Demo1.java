package com.withinDifferentClass;

public class Demo1 extends Demo{
	
	public Demo1() {
		this("Ram");
		System.out.println("This is default constructor in Demo1 class");
	}
	
	public Demo1(String str) {
		System.out.println("This is String type constructor in Demo1 class");
	}

}
