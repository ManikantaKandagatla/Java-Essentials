package com.mywork.javaannotations;

/**
 * @author ManiKanta Kandagatla
 *
 */
@Vehicle(type="Two wheeler", inventedBy= "Some random human being")
public class Cycle {
	String company;
	String name;
	public Cycle(String company, String name) {
		this.company = company;
		this.name = name;
	}
}
