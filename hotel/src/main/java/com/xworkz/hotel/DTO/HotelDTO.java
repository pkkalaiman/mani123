package com.xworkz.hotel.DTO;

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
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="mani_hotel")
public class HotelDTO {
	
	@Id
	@Column(name="hotel_id")
	private int id;
	
	@Column(name="hotel_Name")
	private String hotelName;
	
	@Column(name="hotel_dishName")
	private String dishName;
	
	@Column(name="hotel_type")
	private String type;
	
	@Column(name="hotel_price")
	private double price;
	
	@Column(name="hotel_quantity")
	private int quantity;
	
	/*
	 * @Column(name="hotel_takeAvay") private boolean takeAvay;
	 */
	

}
