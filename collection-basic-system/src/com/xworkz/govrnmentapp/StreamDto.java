package com.xworkz.govrnmentapp;

public class StreamDto {

	private String name;
	private String colors;
	private int age;

	
	
	public StreamDto(String name, String colors, int age) {
		
		this.age=age;
		this.colors=colors;
		this.name=name;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		
		return 30;
	}
	
	@Override
	public String toString() {
		System.out.println("name:"+name + " "+"colors :"+ " "+"age :"+age);
		return "name:"+name;
	}
	
	
}
