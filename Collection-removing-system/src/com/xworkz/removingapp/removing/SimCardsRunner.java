package com.xworkz.removingapp.removing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SimCardsRunner {
	
	public static void main(String[] args) {
		
		String sim1="Airtel";
		String sim2="Jio";
		String sim3="VodaFone";
		String sim4="Bsnl";
		String sim5="AirVoicell";
		String sim6="Airtel";
		String sim8=null;
		
		Collection<String> sim=new ArrayList<String>();
		
		sim.add(sim5);
		sim.add(sim2);
		sim.add(sim4);
		sim.add(sim3);
		sim.add(sim1);
		sim.add(sim6);
		sim.add(sim8);
		
		Iterator<String> itr=sim.iterator();
		
		while(itr.hasNext()) {
			String element=itr.next();
			
			System.out.println(element);  // this is all elements will be printing	
		}
		
		System.out.println("Size Before Removing :"+sim.size()); // elements size will be printing now
		
		boolean removed=sim.remove("Airtel"); // Access and modify
		
		System.out.println("removied Airtel :"+ removed); // this removing object step object TRUE are FALSE
		sim.remove("Airtel"); // another object removing step
		sim.remove(null);
		
		System.out.println("Size After Removing :" +sim.size()); // this is size will be printing in AFTER
		
		for(String string :sim) {
			System.out.println("Elements :"+string);
		}
		
		
	}

}
