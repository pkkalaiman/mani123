package com.xworkz.coffeeapp;

public class Coffee {

		BruCoffee coffee;
		public int amount;
		
		
		public boolean Allow(BruCoffee coffeename, BruCoffee coffee) {
			
			boolean isAllowed= false;
			
			System.out.println("inside allow method");
			System.out.println("the amount is paid:"+this.amount);
			if(amount>=1200);
			
			System.out.println("the amount is paid");
			if(coffeename!=null) {
				
				this.coffee=coffee;
				System.out.println("detials of flavers CoffeeName");
				
				this.coffee.displyDetials();
				isAllowed=true;
				
				System.out.println("CoffeeName has been issued:now");
				
			}
			else {
				System.out.println("now CoffeeName is found");
				
			}
			
			
			return isAllowed;
			
			
		}

}
