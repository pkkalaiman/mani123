package com.xworkz.encapsulationbasic;

public class StudentRunner {
	
	public static void main(String[] args) {
		
		// first */ you Have Create the Object Of Student 
		
		Student sc=new Student();
		
		// now Set the Value
		sc.setId(-100);
		sc.setName("P K Mani");
		sc.setNoOfWorking(30);
		sc.setsalary(-19990.98);
		
		// now Get Value  /* this Step is not mondatory u don't like this you are Directly printing also*/
		/*
		 * sc.getId(); sc.getName(); sc.getnoOfWorking(); sc.getSalary();
		 */
		
		// now Print the Value
		System.out.println("ID: "+sc.getId());
		System.out.println("NAME: "+sc.getName());
		System.out.println("noOfWorking :"+sc.getnoOfWorking());
		System.out.println("Slary: "+sc.getSalary());
	}

}
