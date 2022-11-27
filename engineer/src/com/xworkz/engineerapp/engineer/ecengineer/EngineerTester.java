package com.xworkz.engineerapp.engineer.ecengineer;

import com.xworkz.engineerapp.CsEngineer.CsEngineer;
import com.xworkz.engineerapp.ecEngineer.EcEngineer;
import com.xworkz.engineerapp.engineer.Engineer;

public class EngineerTester {
	
	public static void main(String[] args) {
		
		
		//casting 
		
		//converting from the parent to child-- do it explicitly
		Engineer engineer =new Engineer();
		
		//polymorphism -- // implicit
		
		EcEngineer ecEngineer = (EcEngineer) engineer;
		
	
		
		//polymorphism
		
		Object object =new EcEngineer();
		Object object2 =new EcEngineer();
		
		EcEngineer ecEngineer1 =new EcEngineer();
		ecEngineer1.solveProbelms();
		
		Object object1 =new CsEngineer();
		Object object11 =new CsEngineer();
		
		CsEngineer csengineer =new CsEngineer();
		csengineer.solveProbelms();
		
		
	}

}
