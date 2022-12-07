package com.xworkz.showroomapp.Showroom.ShowTest;

import java.util.Scanner;

import com.xworkz.showroomapp.Showroom.Gender;
import com.xworkz.showroomapp.Showroom.Manager;
import com.xworkz.showroomapp.Showroom.ShowRoom;

public class ShowRoomTester {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=0;
		
		System.out.println("Enetr size");
		
		int size =sc.nextInt();
		
		ShowRoom sw = new ShowRoom(size);
		
		while(n<size) {
			
			Manager man =new Manager();
			
			System.out.println("Enter the manager Name");
			man.setName(sc.next());
			System.out.println("Enter the manager Age");
			man.setAge(sc.nextInt());
			
			System.out.println("Enter the manager address");
			man.setAddress(sc.next());
			
			System.out.println("Enter the manager Gender");
		    man.setGender(Gender.valueOf(sc.next()));
		    
		    System.out.println("Enter the manager role");
		    man.setRole(sc.next());
		    
		    sw.added(man);
		    n=n+1;
		
		}
		
		sw.getManager();
		
		System.out.println("Enter manager name to search");
		sw.getManagerByName(sc.next());
		
		System.out.println("Enter manager age to search");
		sw.getmanagerByAge(sc.nextInt());
		
		System.out.println("Enetr manager address to search");
		sw.getmanagerByAddress(sc.next());
		
		System.out.println("Enetr manager Gender to search");
		sw.getmanagerByGender(Gender.valueOf(sc.next()));
		
		System.out.println("Enter manager to search manager name");
		sw.getManagerNameByGender(Gender.valueOf(sc.next()));
		
		System.out.println("Enter manager to search manager gender");
		sw.getGenderBymanagerName(Gender.valueOf(sc.next()));
		
		System.out.println("Enter manager name and newaddress to update the address");
		
		if(sw.updateAddressByName(sc.next(), sc.next())) {
			
			System.out.println("update or the dtat or address");
		}
		else {
			System.out.println("Unable to facth the deteails");
		}
		
		System.out.println("enter manager to delete");
		sw.deleteByName(sc.next());
		
		System.out.println("enter manager age to delete");
		sw.deleteByAge(sc.nextInt());
		
		System.out.println("Enetr manager gender to delete ");
		sw.deleteByGender(Gender.valueOf(sc.next()));
		sw.getNewManager();
		
		
		System.out.println("Enter manager Gender to delete");
		sw.deleteByGender(Gender.valueOf(sc.next()));
		sw.getNewManager();
		
		
		
		
	}

}
