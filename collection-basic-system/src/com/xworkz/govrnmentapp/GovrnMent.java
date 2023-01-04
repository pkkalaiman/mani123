package com.xworkz.govrnmentapp;

import java.io.Serializable;

public interface GovrnMent extends Serializable {

	
	public static void main(String[] args) {
		
	
	GovrnMent any=new GovrnMent() {
		
		@Override
	  public void play(int t, String h) {
		  System.out.println("runner is called on object");
		  System.out.println(t);
		  System.out.println(h);
	  }
	};
	any.play(5, "Mani");
	}

	 void play(int i, String string);
}
