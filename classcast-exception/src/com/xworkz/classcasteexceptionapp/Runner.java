package com.xworkz.classcasteexceptionapp;

public class Runner {
	
	public static void main(String[] args) {
		
		Father f;
		 f=new Dhouther();
		
		if(f instanceof Son) {
			Son s=(Son) f;
			System.out.println(s.name+" Salary :"+s.salary);
			
		}else if(f instanceof Dhouther) {
			Dhouther d= (Dhouther) f;
			System.out.println(d.address+" "+d.name);
		}
		
		Son s=new Son();
		Dhouther d=new Dhouther();
		Father F=new Father();
		
		System.out.println(f);
		
	}

}
