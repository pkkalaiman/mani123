package com.xworkz.Aeroplane.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "aeroplane_table")
public class AeroplaneEntity {

	@Id
	@Column(name="a_id")
	private int id;
	
	@Column(name = "a_companyName")
	private String companyName;

	@Column(name = "a_name")
	private String name;

	@Column(name = "a_cost")
	private int cost;

	@Column(name = "a_types")
	private String typse;

	@Column(name = "a_country")
	private String country;

}
