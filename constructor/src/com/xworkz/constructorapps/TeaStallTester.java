package com.xworkz.constructorapps;

import com.xworkz.constructorapps.constructorapp.TeaStall;

public class TeaStallTester {

	public static void main(String args[]) {
		
		
		TeaStall ref = new TeaStall();
		
		System.out.println(ref.name + " "+ TeaStall.Teastall + " "+ ref.ownerName);
		ref.name = "chaiwala";
		ref.teastallId = 123;
		ref.ownerName = "pkMani";
		System.out.println(ref.name + " "+ ref.teastallId);
		System.out.println("ownerName object is created");
		
		
		TeaStall ref1 =new TeaStall();
		
		System.out.println(ref1.name + " "+ ref1.teastallId + " "+ ref1.ownerName);
		
		
	}
	
}
