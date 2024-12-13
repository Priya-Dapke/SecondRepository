package com.withinDifferentClass;

public class Demo {
	
	String name;
	
	public Demo() {
		this("A");
		System.out.println("This is default constructor");
	}
	
	public Demo(String s) {
		System.out.println("This is String type constructor");
	}

}
