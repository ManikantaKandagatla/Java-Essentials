package com.mywork.javaannotations;

@Vehicle(type = "Four Wheeler", inventedBy = "Some human being")	
public class Car {
	String company;
	String name;
	public Car(String company, String name) {
		this.company = company;
		this.name = name;
	}
}
