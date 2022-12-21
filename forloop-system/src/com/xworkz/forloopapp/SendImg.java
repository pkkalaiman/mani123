package com.xworkz.forloopapp;

public class SendImg extends UserLoop {

	SendImg(String name, long contact, String bio) {
		super(name, contact, bio);
		// TODO Auto-generated constructor stub
	}
	
	public void sendImg(String to, String img) {
		System.out.println(name +"send text to"+to);
		
		System.out.println(img);
		
	}

}
