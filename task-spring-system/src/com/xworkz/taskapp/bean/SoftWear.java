package com.xworkz.taskapp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SoftWear {

	private String name;

	private double version;

	@Autowired
	@Qualifier("Softweardevelopper")
	private String developper;

	@Autowired
	@Qualifier("Devlopperfree")
	private String free;

	public SoftWear() {
		System.out.println("Created SoftWear in No argument class To Spring..");
	}

	@Autowired
	public SoftWear(String name, double version,String developper, String free) {
		super();
		this.name = name;
		this.version = version;
		this.developper = developper;
		this.free = free;
	}

	@Override
	public String toString() {
		return "SoftWear [name=" + name + ", version=" + version + ", developper=" + developper + ", free=" + free
				+ "]";
	}

	public String getName() {
		return name;
	}

	public String getDevelopper() {
		return developper;
	}

	public String getFree() {
		return free;
	}

	public double getVersion() {
		return version;
	}

	@Autowired
	@Qualifier("Sofwearversion")
	public void setVersion(double version) {
		this.version = version;
	}

}
