package com.xworkz.collectionapp.SoftWearCompanies;

import java.util.ArrayList; 
import java.util.Collection;
import java.util.Iterator;


public class SoftWearCompanies {
	
	public static void main(String[] args) {
		
		String soft1="GLOBAL";
		String soft2="MNC COMPANNY";
		String soft3="APPLE I PHONE";
		String soft4="JIO";
		String soft5="AIRTEL";
		String soft6="REILAINNCE";
		String soft7="MICRO SOFT";
		String soft8="ORACLE";
		String soft9="ALPHABET";
		String soft10 ="ADOBE";
		String soft11="SALESE FORCE";
		String soft12="IBM";
		String soft13="SAP";
		String soft14="INTUIT";
		String soft15="AUTOMATIC DATA";
		String soft16="SERVICDE NOW";
		String soft17="SYNOPYS";
		String soft18="WORKDAY";
		String aoft19="ATLASSIN";
		String soft20="DATA DOG";
		
		
		Collection<String> col=new ArrayList<String>();
		
		
		
		col.add(soft20);
		col.add(aoft19);
		col.add(soft18);
		col.add(soft17);
		col.add(soft16);
		col.add(soft15);
		col.add(soft14);
		col.add(soft13);
		col.add(soft12);
		col.add(soft11);
		col.add(soft10);
		col.add(soft9);
		col.add(soft8);
		col.add(soft7);
		col.add(soft6);
		col.add(soft5);
		col.add(soft4);
		col.add(soft3);
		col.add(soft2);
		col.add(soft1);
		
		System.out.println("Before clear \n");
		
		System.out.println(col);
		
		System.out.println("Size :"+col.size());
		
		System.out.println("After Clear \n");
		
		
		
		Iterator<String> itr=col.iterator();
		
		while(itr.hasNext()) {
			String element=itr.next();
			System.out.println(element);
			
			
			if(element.startsWith("m")) {
			boolean element1=itr.equals(soft18);
				System.out.println("Removing Element :"+element.equals(soft1));
				System.out.println(element1);
				
				
			}
			
			
		}
	}
}

