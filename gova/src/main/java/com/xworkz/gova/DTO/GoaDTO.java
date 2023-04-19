package com.xworkz.gova.DTO;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "gova_table")
public class GoaDTO {

	@Column(name="id")
	@Id
	private int id;
	@Column(name="g_name")
	private String name;
	@Column(name="g_cruise")
	private String cruise;
	@Column(name="g_entryFees")
	private int entrFees;
	@Column(name="g_freeFood")
	private String freeFood;
	@Column(name="g_freeAlcohol")
	private String freeAlcohol;
}
