package com.xworkz.softwearapp.SoftwarApp;

import com.xworkz.softwearapp.Employe.Employee;

public class SoftWearCompany {
	
	public Employee employee;
	
	public boolean isEmployee=true;
	public boolean isProjectrequird =true;
	
	 
	public boolean isjoin(Employee emp) {
		
		boolean isjoined=false;
		
		if(isProjectrequird==true) {
			
			if(isEmployee==true){
			
			this.employee=employee;
			
			employee.displayInfo();
			
			System.out.println("Employee Allowed in Softwear Developper in main Brance");
		
			
			}
			
		}else {
			System.out.println("Work is Not Required ---------");
		}
		
		return isjoined;
	}
}
