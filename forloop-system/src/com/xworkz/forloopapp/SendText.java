package com.xworkz.forloopapp;

public class SendText extends UserLoop {
	
	SendText(String name, long contact, String bio) {
		super(name, contact, bio);
		
	}

	public void sendTxt(String to, String msg) {
		
		System.out.println(name + "send text to "+to);
		
		System.out.println(msg);
	}

}
