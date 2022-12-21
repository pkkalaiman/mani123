package com.xworkz.atmapp.ProjectATM.MainClass.Interface;

import java.util.HashMap; 
import java.util.Map;

import com.xworkz.atmapp.ProjectATM.Atm;

public class AtmOparationImple implements AtmOparationInterf {

	Atm atm=new Atm();
	
	Map<Double,String> ministmt=new HashMap<>();
	
	@Override
	public void viewBalncne() {
		System.out.println("Avlilable Balance is : "+atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdarwAmount) {
		if(withdarwAmount%500==0)
		if(withdarwAmount<=atm.getBalance()){
			ministmt.put(withdarwAmount,"Amount Withdrawn");
			System.out.println("Collect the Cash"+withdarwAmount);
			atm.setBalance(atm.getBalance()-withdarwAmount);
			viewBalncne();	
		}
		else {
			System.out.println("Insufficient Balance !!");
		}
		else {
			System.out.println("Please Enter The Amount in Multiple of 500");
		}
	}
	
	

	@Override
	public void depositeAmoount(double depositeAmount) {
		ministmt.put(depositeAmount, "Amount Deposited");
		System.out.println(depositeAmount+"Deposited Successfully !!");
		atm.setBalance(atm.getBalance()+depositeAmount);
		viewBalncne();
		
		
	}

	@Override
	public void miniStatement() {
		for(Map.Entry<Double, String> m:ministmt.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
		
	}

}
