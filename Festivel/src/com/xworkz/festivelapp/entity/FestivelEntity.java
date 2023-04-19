package com.xworkz.festivelapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "festivel_table")
@NamedQuery(name = "findByName", query = "select anything from  FestivelEntity anything  where anything.name='name'")
public class FestivelEntity {

	@Id
	@Column(name = "f_id")
	private int id;

	@Column(name = "f_name")
	private String name;

	@Column(name = "f_sweet")
	private String sweet;

	@Column(name = "f_region")
	private String resgion;

	@Column(name = "f_totalDays")
	private int totalDays;

	@Column(name = "f_mainGod")
	private String mainGod;

	public FestivelEntity(String name, String sweet, String resgion, int totalDays, String mainGod) {
		super();
		this.name = name;
		this.sweet = sweet;
		this.resgion = resgion;
		this.totalDays = totalDays;
		this.mainGod = mainGod;
	}

}
