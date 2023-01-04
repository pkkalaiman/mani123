package com.xworkz.setapp;

public class BakeryDto{

	private String name;
	private int price;
	private String color;
	private String workersname;

	public BakeryDto(String name, int price, String color, String workers) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.workersname = workers;
	}

	@Override
	public int hashCode() {

		return 20;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof BakeryDto) {
				BakeryDto child = (BakeryDto) obj;
				if (child.name.equals(this.name) && child.price == this.price && child.color.equals(this.color)
						&& child.workersname == this.workersname)
					;

				System.out.println("Bakery Is Same :" + this.name);
			   System.out.println("Bakery is diferent workers :"+this.workersname);

				return false;
			}
		}

		return false;

	}

	@Override
	public String toString() {

		System.out.println("name :" + " " + name + " " + "color :" + " " + color + " " + "  " + "Price :" + price + " "
				+ " " + "WorkersNames :" + workersname);

		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfBekery() {
		return price;
	}

	public void setNoOfBekery(int price) {
		this.price = price;
	}

	public String getAge() {
		return color;
	}

	public void setAge(String color) {
		this.color = color;
	}

	public String getWorkers() {
		return workersname;
	}

	public void setWorkers(String workers) {
		this.workersname = workers;
	}

}
