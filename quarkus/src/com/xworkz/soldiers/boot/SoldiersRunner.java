package com.xworkz.soldiers.boot;

import com.xworkz.soldiers.dto.SoldiersDto; 
import com.xworkz.soldiers.repository.SoldiersRepoImple;
import com.xworkz.soldiers.service.SoldiersServiceImpl;

public class SoldiersRunner {

	public static void main(String[] args) {

		SoldiersDto dto = new SoldiersDto("mani P K", 22, "Topper", "Bangalore");

		SoldiersServiceImpl service = new SoldiersServiceImpl();
		SoldiersRepoImple repo= new SoldiersRepoImple();
		
		service.setSolderRpo(repo);// it is validator
		
		service.validateAndSave(dto);
		
	}

}
