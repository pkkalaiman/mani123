package com.xworkz.collectionapp.BikeApp;

import java.util.Collection;
import java.util.TreeSet;

public class Bikes {
	
public static void main(String[] args) {
		
		String bk1="K T M";
		String bk2="DUKE";
		String bk3="PULSAR";
		String bk4="HERO HONDA";
		String bk5="HERO";
		String bk6="HONDA";
		String bk7="KAWASKER";
		String bk8="SCOOTER";
		String bk9="DUKATI";
		String bk10="BHAJAJ";
		String bk11="SUZUKI";
		String bk12="ROYAL ENFIELD";
		String bk13="JAWA";
		String bk14="APPOCHI";
		String bk15="DISCOVER";
		String bk16="CT 100";
		String bk17="PASSION BRO";
		String bk18="YAMAHA";
		String bk19="TVS EXCELL";
		String bk20="BGAUSS";
		
		
		Collection<String> col=new TreeSet<String>();
		
		col.add(bk20);
		col.add(bk19);
		col.add(bk18);
		col.add(bk17);
		col.add(bk16);
		col.add(bk15);
		col.add(bk14);
		col.add(bk13);
		col.add(bk12);
		col.add(bk11);
		col.add(bk10);
		col.add(bk9);
		col.add(bk8);
		col.add(bk7);
		col.add(bk6);
		col.add(bk5);
		col.add(bk4);
		col.add(bk3);
		col.add(bk2);
		col.add(bk1);
		
		System.out.println("before clear \n");
		
		System.out.println(col);
		
		System.out.println("Size :"+col.size());
		
		System.out.println("Before Clear \n");
		
		col.clear();
		
		
		
		
		
	}

}
