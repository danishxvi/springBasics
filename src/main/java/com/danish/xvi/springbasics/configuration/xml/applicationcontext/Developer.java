package com.danish.xvi.springbasics.configuration.xml.applicationcontext;

// This is a simple POJO (Plain Old Java Object)
public class Developer {

	public Developer() {
		System.out.println("Developer constructor called.");
		System.out.println("Developer object has been created by Spring.");
	}

	public void coding() {
		System.out.println("Writing Java code...");
	}
}