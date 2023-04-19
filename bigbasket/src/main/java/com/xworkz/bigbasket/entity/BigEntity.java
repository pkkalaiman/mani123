package com.xworkz.bigbasket.entity;

import java.time.LocalDate;

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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bigbas_table")
public abstract class BigEntity {

	@Id
	@Column(name = "b_id")
	private int id;

	@Column(name = "b_name")
	private String name;

	@Column(name = "b_customerName")
	private String customerName;

	@Column(name = "b_phoneNo")
	private long phoneNumber;

	@Column(name = "b_E_mail")
	private String email;

	@Column(name = "b_prodectName")
	private String prodectName;

	@Column(name = "b_password")
	private int password;

	@Column(name = "b_price")
	private double price;

	@Column(name = "b_quantity")
	private int quantity;

	@Column(name = "b_color")
	private String color;

	@Column(name = "b_place")
	private String place;

	@Column(name = "b_date")
	private LocalDate date;

}
