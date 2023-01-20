package com.xworkz.taskapp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class SoftWear {

	@Autowired
	@Qualifier("Devloppername")
	private String name;

	@Autowired
	@Qualifier("Softwearversion")
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

	

}
