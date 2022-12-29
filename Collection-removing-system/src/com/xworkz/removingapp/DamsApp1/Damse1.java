package com.xworkz.removingapp.DamsApp1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Damse1 {
	
	public static void main(String[] args) {
		
		Collection<String> dams=new ArrayList<String>();
		
		
	dams.add("KRISHNA RAJA SAGARA");
	dams.add("TUNGA BHADRA ");      
	dams.add("BHADRA ");
	dams.add("LINGANA MAKKI ");
	dams.add("MLABHRABHA ");
	dams.add("RAJA LAKSHMANA GOWDA");
	dams.add("HEMAVATHY");
	dams.add("SUBHA ");
	dams.add("LAKKY ");
	dams.add("ALMATTI ");
	dams.add("KAKKI RESERVOIR");
	dams.add("THE IDUKKU ");
	dams.add("KULAMAVU ");
	dams.add("IDAMALAYAR ");
	dams.add("cherudani dam  kerala ");
	dams.add("GANDHI SAGAR ");
	dams.add("INIRA SAGAR ");
	dams.add("BHAKRA DANGAL ");
	dams.add("SARDAR SRAVAR ");
	dams.add("NAGARJUNA SAGAR");
	dams.add("SOMASILA ");
	dams.add("mullai periyar");
	dams.add("PANCHET ");
	dams.add("METTUR ");
	dams.add("SRI SAILAM ");
	dams.add("koyna ");
	dams.add("TEHRI ");
	dams.add("HIRAKHUD ");
	dams.add("KRP DAM");

    
          Iterator<String> itr=dams.iterator();
          
          while(itr.hasNext()) {
        	String element= itr.next();
          
        	System.out.println(element);
        	
       
      //  System.out.println("Size of elements :"+dams);
        	
          }
          
 //**************************************************************************************************************************/
       System.out.println("Testing has next After Itarator : "+itr.hasNext());
          
          System.out.println("========== STARTING ELEMENT=============");
        	
          Iterator<String> dam=dams.iterator();
          
          while(dam.hasNext()) {
        	  String element=dam.next();
        	  
        	if(element.startsWith("B")) {
        	System.out.println("Before start With B :" +element); 
       	  }
        	
          }
          
 //*****************************************************************************************************************************
          
          System.out.println("===========ENDING ELEMENTS=========");
          
          Iterator<String> ete=dams.iterator();
          
          while(ete.hasNext()) {
        	  String element=ete.next();
        	  
        	  if(element.endsWith("AR")) {
        		  System.out.println("After Ending Witch AR :"+element);
        		  
        		  ete.remove();
        	  }
          }
          
 //*************************************************************************************************************************************/
          
          System.out.println("=======UPPER CASE ELEMENTS  =============");
                   
        	
	    }
          
	}

