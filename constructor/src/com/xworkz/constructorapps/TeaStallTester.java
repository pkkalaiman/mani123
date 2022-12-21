package com.xworkz.constructorapps;

import com.xworkz.constructorapps.constructorapp.TeaStall;

public class TeaStallTester {

	public static void main(String args[]) {
		
		
		TeaStall ref = new TeaStall();
		
		
		ref.name = "chaiwala";
		ref.teastallId = 123;
		ref.ownerName = "pkMani";
		
		System.out.println(ref.name + " "+
						   ref.teastallId + " "+ 
						   ref.ownerName);
		
		System.out.println("ownerName object is created");
		
		System.out.println(ref.name + " "+ "name" );
		System.out.println(ref.teastallId +" "+"Id");
		System.out.println(ref.ownerName +" " +"Owner" );
		
		
		
		TeaStall ref1 =new TeaStall();
		
		System.out.println(ref1.name + " "+ ref1.teastallId + " "+ ref1.ownerName);
		
		
		
	}
	
}
