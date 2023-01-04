package com.xworkz.setapp.CakeDto;

public class CakeDto {

	private String name;
	private int price;
	private String color;
	private String workers;

	public CakeDto(String name, int price, String color, String workers) {

		this.name = name;
		this.price = price;
		this.color = color;
		this.workers = workers;

	}

	public int hasCode() {

		return 20;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			if (obj instanceof CakeDto) {
				CakeDto child = (CakeDto) obj;

				System.out.println(child.name.equals(this.name) && child.price == this.price);

				System.out.println("CakeDto is Same :" + this.name);
			}
		}

		return false;
	}

	@Override
	public String toString() {

		System.out.println(
				"name :" + name + " " + "color :" + color + " " + "Price :" + price + " " + "Workers :" + workers);

		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;

	}

	public void setPrice(int price) {
		this.price = price;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;

	}

	public String getWorkers() {
		return workers;
	}

	public void setWorkers(String workers) {
		this.workers = workers;
	}

}
