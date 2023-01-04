package com.xworkz.abstractionapp.Trasportationapp;

public class TransPortation {

	RedBusContract redbuscontract;

	int noOfBookings;

	String name = "mani transport";

	public boolean bookings(RedBusContract contract) {
		boolean isBookigDone = false;

		System.out.println("Inside booking methiod");

		boolean condition = contract.conditionbOfBus();
		if (condition == true) {

			System.out.println("Bus is good condittion");

			if (noOfBookings < contract.minBookinggs()) {
				System.out.println("No of bookings is :23 " + noOfBookings);
				System.out.println(" Thank fo booking the ticket throught :" + name);

			} else {
				System.out.println("connot proced the booking as noOfBookings Eceds");

			}

		} else {
			System.out.println("connot proced the booking bus is not good condittion");

		}
		return isBookigDone;

	}

}
