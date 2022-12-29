package com.xworkz.coupponapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class couppon {
	
	public static void main(String[] args) {
	
	String str ="IIWFIW9FWI898988RKNFH";
	String str1="JWIIOWI992UY8IUG";
	String str2="JFWIUFWK71375JHJEF";
	String str3="IWUFWUWDK792YJHVHVJ";
	String str4="JNIFGW73R90EJH";
	String str5="6889BIEWBBEEH OJOJ";
	String str6="LJHIUW8738NJEFIH";
	String str7="BIHQ64742LKKNNJU";
	String str8="TKNKD88665MJH";
	String str9="UG75DGTR8686";
	String str10=null;
	
	
	Collection<String> cupon=new ArrayList<String>();
	
	cupon.add(str2);
	cupon.add(str1);
	cupon.add(str);
	cupon.add(str3);
	cupon.add(str4);
	cupon.add(str5);
	cupon.add(str6);
	cupon.add(str7);
	cupon.add(str8);
	cupon.add(str9);
	cupon.add(null);
	cupon.add(str10);
	

	
	Iterator<String> itr=cupon.iterator();
	
	while(itr.hasNext()) {
	String element=itr.next();
	
	System.out.println(element);
	
	}	
	
	boolean	remove=cupon.remove("IIWFIW9FWI898988RKNFH");
	
	System.out.println("After removing :"+remove);
	
	cupon.remove(str);
	cupon.remove(null);
	
	System.out.println();
	
	System.out.println("After removing Size :"+cupon.size());
	
	for(String string:cupon) {
		
		System.out.println("After Element :"+string);
	}
	
	
	}
	
}
	

	



