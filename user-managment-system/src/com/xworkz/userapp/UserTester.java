package com.xworkz.userapp;

import com.xworkz.userapp.user.User;

public class UserTester {
	
	public static void main(String[] args) {
		
		User user =new User();
		user.setName("Mani");
		user.setId("2456HUG");
		user.setaddress("Banglore");
		user.setphoneNo(9514839766L);
		user.setrubiees(5000);
		user.settravelCharge(15000);
		user.setentryfees(25000);
		
		
		
		System.out.println(user.getName());
		System.out.println(user.getId());
		System.out.println(user.getaddress());
		System.out.println(user.getphoneNo());
		System.out.println(user.getrubiees());
		System.out.println(user.gettravelCharge());
		System.out.println(user.getentryfees());
		
		
		
		
		
		
		

}
}