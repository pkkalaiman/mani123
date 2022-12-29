package com.xworkz.removingapp.DamseApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.removingapp.DamsApp1.Damse1;

public class DamesRunner {
	
	public static void main(String[] args) {
		
		
		String dam1="KRISHNA RAJA SAGARA";
		String dam2="TUNGA BHADRA DAM";
		String dam3="BHADRA DAM";
		String dam4="LINGANA MAKKI DAM";
		String dam5="MLABHRABHA DAM";
		String dam6="RAJA LAKSHMANA GOWDA DAM";
		String dam7="HEMAVATHY DAM";
		String dam8="SUBHA DAM";
		String dam9="LAKKY DAM";
		String dam10="ALMATTI DAM";
		String dam11="KAKKI RESERVOIR";
		String dam12="THE IDUKKU DAM";
		String dam13="KULAMAVU DAM";
		String dam14="IDAMALAYAR DAM";
		String dam15="cherudani dam  kerala dams";
		String dam16="GANDHI SAGAR DAM";
		String dam17="INIRA SAGAR DAM";
		String dam18="BHAKRA DANGAL DAM";
		String dam19="SARDAR SRAVAR DAM";
		String dam20="NAGARJUNA SAGAR DAM";
		String dam21="SOMASILA DAM";
		String dam22="MULLAI PERIYAR DAM";
		String dam23="PANCHET DAM";
		String dam24="METTUR DAM";
		String dam25="SRI SAILAM DAM";
		String dam26="KOYNA DAM";
		String dam27="TEHRI DAM";
		String dam28="HIRAKHUD DAM";
		String dam29="KRP DAM";
		
		
		Collection<String> col=new ArrayList<String>();
		
		col.add(dam29);
		col.add(dam28);
		col.add(dam27);
		col.add(dam26);
		col.add(dam25);
		col.add(dam24);
		col.add(dam23);
		col.add(dam22);
		col.add(dam5);
		col.add(dam1);
		col.add(dam2);
		col.add(dam4);
		col.add(dam6);
		col.add(dam7);
		col.add(dam3);
		col.add(dam9);
		col.add(dam8);
		col.add(dam10);
		col.add(dam11);
		col.add(dam12);
		col.add(dam13);
		col.add(dam15);
		col.add(dam14);
		col.add(dam16);
		col.add(dam17);
		col.add(dam18);
		col.add(dam19);
		col.add(dam20);
		col.add(dam21);
		
		Iterator<String> itr=col.iterator();
		
		while(itr.hasNext()) {
			String element=itr.next();
			
		//System.out.println(element);
		
		
		
		boolean etr =element.endsWith("re");
		if(element.startsWith("t")) {
		//System.out.println("Aftre ending in er :"+element);
		//System.out.println("After Starting in T :"+etr);
		
		}	
		
		System.out.println("Before size to DAM :"+col.size());
		
		boolean removed=col.remove(dam29);
		System.out.println("removing DAM 29 :"+removed);
		
		col.remove(dam1);
		System.out.println("Removing DAM 1 :" +removed);
		
		System.out.println("After size in DAMS :"+col.size());
		
		for(String string:col) {
			
			System.out.println("After removin :"+string);
			
		}
	}
		
	}

}
