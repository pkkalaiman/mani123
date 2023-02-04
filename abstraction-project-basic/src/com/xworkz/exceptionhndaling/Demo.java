package com.xworkz.exceptionhndaling;

public class Demo {

	public static void main(String[] args) {

		System.out.println("start"); // this my understanding only
		try {
			System.out.println(10 / 0);

			/*
			 * 1 :you don't know exception name the you will use this step catch(Exception obj){} 
			 * 2:you know the exception name the you will mension the name Example
			 * **catch(ArithmaticException obj){}
			 */
			
			
		} catch (Exception e) {

			e.printStackTrace(); /* this is using in only exception name and meassage printing to this line */
		}
		System.out.println("end");

	}

}
