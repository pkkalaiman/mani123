package com.xworkz.compiletime;

public class CompileTimePoly {
	
	/* compile time polymarphism is execute in methods binding 
	 * who will diside in in which method executed ion program 
	 * Compiler will be diside to which method executed*/
	
	void hospital(String name) {
	System.out.println(name);	
	}
	
	void hospital(String name,int cost) {
	System.out.println(name+" "+cost);	
	}
	
	void hospital(int hospitalid,String empname) {
		System.out.println(hospitalid+" "+empname);
	}
	
	void hospital(double salary) {
		System.out.println(salary);
	}
	
	void hospital(int noOfEmp, boolean company) {
		System.out.println(noOfEmp+" "+company);
	}

}
