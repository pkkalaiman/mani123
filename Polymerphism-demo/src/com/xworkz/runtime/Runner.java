package com.xworkz.runtime;

public class Runner {

	public static void main(String[] args) {
		
		/* who will be disided / in JVM Will Disited in which method executed */

		Employee emp = new Developper();
		
		/* When you are passing sub class object in supper class Refernce override is
		 * sub class method will be executed
		 */
		emp.empName();

		Employee em = new Tester();
		em.empName();

		System.out.println("===================");

		/* this is an another step of declaration and inilzation */
		Employee e; // It Declaration of Variable

		e = new Developper();
		e.empName();

		e = new Tester();
		e.empName();

	}
}
