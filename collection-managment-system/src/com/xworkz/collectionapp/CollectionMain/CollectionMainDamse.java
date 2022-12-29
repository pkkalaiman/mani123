package com.xworkz.collectionapp.CollectionMain;

import java.util.ArrayList; 
import java.util.Collection;
import java.util.Iterator;

public class CollectionMainDamse {
	
	public static void main(String[] args) {
		
		Collection<String> karnataka=new ArrayList<String>();
		
		karnataka.add("KRISHNA RAJA SAGARA");
		karnataka.add("TUNGA BHADRA ");
		karnataka.add("BHADRA");
		karnataka.add("LINGANA MAKKI");
		karnataka.add("MLABHRABHA");
		karnataka.add("RAJA LAKSHMANA GOWDA");
		karnataka.add("MHEMAVATHY");
		karnataka.add("SUBHA");
		karnataka.add("ALMATTI ");
		karnataka.add("THE IDUKKU");
		
		
		
		Collection<String> tamilnadu=new ArrayList<String>();
		
		tamilnadu.add("KAAVAERI DAM");
		tamilnadu.add("K R P DAM");
		tamilnadu.add("BANJAPALLI ANAI");
		tamilnadu.add("MATTUR ");
		tamilnadu.add("SOLAYAIR");
		tamilnadu.add("BHAVANI SAGAR");
		tamilnadu.add("AANAI MADUVU");
		tamilnadu.add("ADAVINAINARK");
		tamilnadu.add("ALIYAR");
		tamilnadu.add("AMARAVATHI");
		tamilnadu.add("MANI MUTHUOOR");
		
		
		Collection<String> andraparadesh=new ArrayList<String>();
		
		andraparadesh.add("TATTIPUDI RESERVIOIR");
		andraparadesh.add("GANDHIPALAM RESARVOIR");
		andraparadesh.add("RAMAGUNDAM DAM");
		andraparadesh.add("DUMMAGUNDA DA");
		andraparadesh.add("SRISAILAM");
		andraparadesh.add("SOMSILA RIVAR");
		andraparadesh.add("AANAI MADUVU");
		andraparadesh.add("MANI MUTHUOOR");
		andraparadesh.add("TATTIPUDI RESERV");
		
		
		Collection<String> rajesthan=new ArrayList<String>();
		
		rajesthan.add("RANAPRADHAP SAGAR");
		rajesthan.add("MAHA BHAJAR ");
		rajesthan.add("BISALPHUR DAM");
		
		
		
		Collection<String> telengana=new ArrayList<String>();
		
		telengana.add("NAGARJUNA ");
		telengana.add("NIZAM SAGAR");
		telengana.add("DINDHI RESERVIOIR ");
		telengana.add("LOWER MANAIR DAM ");
		telengana.add("SINGUR DAM");
		
		Collection<String> bihar=new ArrayList<String>();
		
		bihar.add("KHOHOIR DAM");
		bihar.add("NAAGI RIVAR");
		bihar.add("KHOHOIR DAM");
		bihar.add("Ajan dam");
		bihar.add("Amgrithy river");
		bihar.add("Baduva ");
		bihar.add("Barner");
		
		Collection<String> chhattigar=new ArrayList<String>();
		
		chhattigar.add("HASDIGI BANGO RIVER");
		chhattigar.add("MANI MUTHUOOR");
		chhattigar.add("KHOHOIR DAM");
		chhattigar.add("NAAGI RIVAR");
		chhattigar.add("KHOHOIR DAMR");
		chhattigar.add("DINDHI RESERVIOIR");
		chhattigar.add("LOWER MANAIR DAM");
		chhattigar.add("MAGARJUNA");
		chhattigar.add("SINGUR DAM");
		chhattigar.add("LOWER MANAIR DAM");
		chhattigar.add("MANI MUTHUOOR");
		
		Collection<String> gujarat=new ArrayList<String>();
		
		gujarat.add("KADANA");
		gujarat.add("KARJAN RESERVOIR");
		gujarat.add("cherudani dam  keral");
		gujarat.add("SARDHAR SARAVOR");
		gujarat.add("UKKAI DAM");
		gujarat.add("KADANA");
		
		
		Collection<String> himachal=new ArrayList<String>();
		
		himachal.add("the bong dam");
		himachal.add("the chamera river");
		
		
		Collection<String> jharghand=new ArrayList<String>();
		
		jharghand.add("the maithon");
		jharghand.add("panchet");
		jharghand.add("teunughant");
		
		
		Collection<String> kerala=new ArrayList<String>();
		
		kerala.add("KAKKI RESERVIOIR");
		kerala.add("THE IDUKKI DAM");
		kerala.add("CHERUTHANI RIVAR");
		kerala.add("KULAMAVU DAM");
		kerala.add("IDAMALAYAR DAM");
		
		
		Collection<String> odisha=new ArrayList<String>();
		
		odisha.add("Indaravathi dam");
		odisha.add("The jalaphut dam");
		odisha.add("Mandhira dam");
		
		
		Collection<String> punjab=new ArrayList<String>();
		
		punjab.add("THE RUNJITH SAGAR");
	
		
		Collection<String> utragand=new ArrayList<String>();
		
		utragand.add("RAM GANGA DAM");
		utragand.add("JAM RANI DAM");
		utragand.add("THE TEHRI DAM");
		
		Collection<String> uttrpradesh=new ArrayList<String>();
		
		uttrpradesh.add("Rihand dam");
		uttrpradesh.add("govindbellahabh pant sagar");
		uttrpradesh.add("matatila dam");
		uttrpradesh.add("rajghat");
		
		Collection<String> westbengal=new ArrayList<String>();
		
		westbengal.add("The Mukutamanipur");
		
		
		Collection<String> sk=new ArrayList<String>();
		
		sk.add("SALAM DAM");
		sk.add("BHAHLIGAR DAM");
		
		Collection<String> jammukashmir=new ArrayList<String>();
		
		jammukashmir.add("THE THERI DAM");
		jammukashmir.add("Maithaon dam");
		jammukashmir.add("PACHET RIVER");
		
		Collection<String> dames=new ArrayList<String>();
		
		dames.addAll(himachal);
		dames.addAll(chhattigar);
		dames.addAll(jammukashmir);
		dames.addAll(westbengal);
		dames.addAll(sk);
		dames.addAll(uttrpradesh);
		dames.addAll(utragand);
		dames.addAll(punjab);
		dames.addAll(odisha);
		dames.addAll(kerala);
		dames.addAll(karnataka);
		dames.addAll(tamilnadu);
		dames.addAll(andraparadesh);
		dames.addAll(rajesthan);
		dames.addAll(telengana);
		dames.addAll(bihar);
		dames.addAll(gujarat);
		dames.addAll(jharghand);
		
		
	
		Iterator<String> itr1= dames.iterator();
		
		while(itr1.hasNext()) {
			String element=itr1.next();
			System.out.println(element);
		}
		System.out.println("before size :"+dames.size());
		System.out.println();
		
	System.out.println("============ ELEMENT STARTING WITCH  T ==================");
		
		for(String itr2:dames) {
			if(itr2.startsWith("T") || 
			itr2.startsWith("t")) {
				
				System.out.println(itr2);
			}

		}
		System.out.println("Starting elements T :");
		System.out.println();
		
	System.out.println("====================ELEMENT DAMES ENDING WITCH ER  ===================");
		
	   for(String itr3:dames) {
		 if(itr3.endsWith("ER") ||
		   itr3.endsWith("er")) {
			 
			 System.out.println(itr3);  
		   }
	   }
		System.out.println();
		
		
		
		System.out.println("===========ELEMENT CHARACTER LENGTH = 15 ====================");
		
		for(String itr4:dames) {
			
			char ch[]=itr4.toCharArray();
			
			if(ch.length == 15) {
				if(ch.length==10) {
					continue;
				}
			}
			System.out.println(itr4);
		}
		System.out.println();
		
		
		
  System.out.println("================ ELEMENT CHARACTER IN UPPER CASE ================ ");
		
		for(String itr5:dames) {
			
			System.out.println(itr5.toUpperCase());
		}
		
		System.out.println("Before Upper Case :" +dames.size());
		
		System.out.println();
		
		
 System.out.println("===============ELEMENT CHARACTER WILL LOWER CASE ==============");
		
		for(String itr6:dames) {
			
		System.out.println(itr6.toLowerCase());
		}
		System.out.println();
		
 System.out.println("===============ELEMENT WILL BE POLYNDREM ================");
		
		Iterator<String> iterator=dames.iterator();
		
		while(iterator.hasNext()) {
			String stri=iterator.next();
			
			StringBuffer str=new StringBuffer(stri);
			str.reverse();
			
			String pop=str.toString();
			if(iterator.equals(stri)) {
				
				System.out.println(" HE IS POLYNDREM :"+pop);
	   }
		
		else {
		System.out.println("IS NOT A POLYNDREM :"+pop);
		
		System.out.println();
		
		}
	
	}
	
		
		
 System.out.println("=====================CONTAINSE METHOD P ====================");
		
		Iterator<String> itr=dames.iterator();
		
		while(itr.hasNext()) {
		String elements=itr.next();
		
		if(elements.contains("p")) {
			itr.remove();
			System.out.println("THE ROMOVE OF P :"+elements);
				
		}
		
		}
		System.out.println("AFTER REMOVING SIZE :"+dames.size());	
		
	}

}
