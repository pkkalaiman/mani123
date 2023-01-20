package com.xworkz.soldiers.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MissileDto extends AbstractAuditDto{
	
	public MissileDto() {
		System.out.println("Created Missile Dto in Non Orgument Constructor");
	}
	

}
