package com.xworkz.engineerapp.engineer.ecengineer;

import com.xworkz.engineerapp.CsEngineer.CsEngineer;
import com.xworkz.engineerapp.ecEngineer.EcEngineer;
import com.xworkz.engineerapp.engineer.Engineer;

public class EngineerTester {
	
	public static void main(String[] args) {
		
		//polymorphism
		Object object =new EcEngineer();
		
		Object object2 =new EcEngineer();
		EcEngineer ecEngineer =new EcEngineer();
		ecEngineer.solveProbelms();
		
		Object object1 =new CsEngineer();
		
		Object object11 =new CsEngineer();
		CsEngineer csengineer =new CsEngineer();
		csengineer.solveProblems();
		
		
	}

}
