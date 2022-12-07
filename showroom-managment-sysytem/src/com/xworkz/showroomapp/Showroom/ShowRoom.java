package com.xworkz.showroomapp.Showroom;

public class ShowRoom {
	
	
	
	private static final Object gender = null;

	Manager[] managers;
	
	Manager newManagers[];
	
	int index;

	private int manager;
	
	public ShowRoom(int size) {
		
		managers =new Manager[size];
		
	}
	
	public boolean added(Manager manager) {
		boolean isManagerAdded =false;
		
		if(manager !=null) {
			
			System.out.println("adding");
			
			managers[index]=manager;
			isManagerAdded =true;
			
		}
		
		return isManagerAdded;
		
	}
	
	public void getManager() {
		
		
		for(int j=0; j< managers.length ; j++) {
			
			System.out.println(this.managers[j].getName());
			System.out.println(this.managers[j].getAge());
			System.out.println(this.managers[j].getGender());
			System.out.println(this.managers[j].getAddress());
			System.out.println(this.managers[j].getRole());
			
		}
	}
	
	public void getManagerByName(String name) {
		System.out.println("Inside get managers Name");
		
		for(int i= 0; i < managers.length; i++) {
			if(managers[i].getName().equals(name)) {
				
				System.out.println("Managers found");
				System.out.println(this.managers[i].getName());
				System.out.println(this.managers[i].getAge());
				System.out.println(this.managers[i].getAddress());
				System.out.println(this.managers[i].getGender());
				System.out.println(this.managers[i].getRole());
				
			}	
		}
		
	}
	
	public void getmanagerByAge(int age) {
		
		System.out.println("Inside get manager Age");
		
		for(int i=0; i<managers.length; i++) {
			
			if(managers[i].getAge()==age) {
				
				System.out.println("managers found");
				System.out.println(this.managers[i].getName());
				System.out.println(this.managers[i].getAge());
				System.out.println(this.managers[i].getAddress());
				System.out.println(this.managers[i].getGender());
				System.out.println(this.managers[i].getRole());
			}
		}
	}

	public void getmanagerByAddress(String address) {
		
		System.out.println("Inside get manager address");
		
		for(int i=0; i < managers.length; i++) {
			
			if(managers[i].getAddress().equals(address)) {
				
				System.out.println("manager found");
				
				System.out.println(this.managers[i].getName());
				System.out.println(this.managers[i].getAge());
				System.out.println(this.managers[i].getAddress());
				System.out.println(this.managers[i].getGender());
				System.out.println(this.managers[i].getRole());
				
			
			}
		}
	}
	
	public void getmanagerByGender(Gender gender) {
		
		System.out.println("Inside get manager Gender");
		
		for(int i=0; i < managers.length; i++) {
			
			if(managers[i].getGender().equals(gender)) {
				
				System.out.println("manager found");
				
				System.out.println(this.managers[i].getAge());
				System.out.println(this.managers[i].getName());
				System.out.println(this.managers[i].getAddress());
				System.out.println(this.managers[i].getGender());
				System.out.println(this.managers[i].getRole());
				
			}
		}
			
	}
	
	public void getManagerNameByGender(Gender gender2) {
		
		System.out.println("Inside get by manager name by Gender");
		
		for(int i=0; i < managers.length; i++) {
			if(managers[i].getGender().equals(gender)) {
				
				System.out.println("manager found");
				System.out.println(this.managers[i].getName());
				
			}
		}
		
	}
	
	public void getGenderBymanagerName(Gender gender2) {
		
		System.out.println("Inside get Gender By Name");
		
		for(int i=0; i < managers.length; i++) {
			
			if(managers[i].getName().equals(gender2)) {
				
				System.out.println("manager found");
				System.out.println(this.managers[i].getGender());
				
				
			}
		}
		
	}
	
	public boolean updateAddressByName(String name, String newAddress) {
		boolean isupdate =false;
		
		System.out.println("Inside update Address");
		
		for(int i= 0; i < managers.length; i++) {
			
			if(managers[i].getName().equals(newAddress)) {
				
				System.out.println("manager found");
				
				managers[i].setAddress(newAddress);
				isupdate =true;
			}
		}
		 return isupdate;
		
	}
	
	public boolean updateNameByAge(String name, int age) {
		
		boolean isupdate =false;
		
		System.out.println("Inside update by name");
		
		for(int i= 0; i < managers.length; i++) {
			
			if(managers[i].getName().equals(name)) {
				
				System.out.println("managers found");
				
				managers[i].setAge(age);
				isupdate = true;
			}
		}
		
		return isupdate;
		
	}
	
         public boolean deleteByName(String name) {
        	 
        	 boolean isDelete =false;
        	 
        	 System.out.println("Inside delete name");
        	 
        	 newManagers  =new Manager[managers.length];
        	 
        	 for(int i=0,k =0; i < managers.length; i++) {
        		 if(!managers[i].getName().equals(name)) {
        			 
        			 System.out.println("manager foumd");
        			 
        			 newManagers[k++] = managers[i];
        			 
        			 isDelete =true;
        			 
        		 }
        	 }
			return isDelete;
		
	}
         
         public boolean deleteByAge(int age) {
        	 
        	 boolean isDelete=false;
        	 
        	 System.out.println("Inside delete age");
        	 
        	 newManagers =new Manager [managers.length-1];
        	 
        	 for(int i=0, k=0; i < managers.length; i++) {
        		 
        		 if(managers[i].getAge()!=age) {
        			 
        			 System.out.println("managers found");
        			  
        			 newManagers[k++] = managers[i];
        			 
        			 isDelete = true;
        			 
        		 }
        		 
        	 } 
			return isDelete;
        	 
         }
         
         public boolean deleteByGender(Gender gender) {
        	 
        	 boolean isDelete = false;
        	 
        	 System.out.println("Inside delete Gender");
        	 
        	 for(int i=0, k=0; i < managers.length; i++) {
        		 
        		 if(managers[i].getGender().equals(gender)) {
        			 
        			 newManagers[k++] = managers[i];
        			 isDelete =true;
        		 }
        	 }
        	 
        	 return isDelete;
        	 
         }
         
         public void getNewManager() {
        	 for(int j=0; j < managers.length; j++) {
        		 
        		 System.out.println(this.newManagers[j].getName());
        		 System.out.println(this.newManagers[j].getAge());
        		 System.out.println(this.newManagers[j].getAddress());
        		 System.out.println(this.newManagers[j].getGender());
        		 System.out.println("===============================");
        	 }
         }
	
	
	
}

