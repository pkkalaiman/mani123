package com.xworkz.beachapp.beachmain;

import com.xworkz.beachapp.Beach;

public class BeachTester {

	
public static void main(String[] args) {
		
		Beach beach=new Beach();
		beach.setName("malpe");
		beach.setAddress("Rajajinagra");
		beach.setEntryFee(5000);
		beach.setPhoneNo(98756213233L);
		beach.setGrade('A');
		beach.setRupees(6000);
		beach.setTravellingCharge(5000);
		beach.setId("1235DVGH");
		
		
	
		System.out.println(beach.getName());
		System.out.println(beach.getentryFee());
		System.out.println(beach.getAddress());
		System.out.println(beach.getid());
		System.out.println(beach.getPhoneNo());
		System.out.println(beach.getRupees());
		System.out.println(beach.getTravellingCharge());
		System.out.println(beach.getGrade());
		
	}

}

