package com.xworkz.bigbasket.DTO;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class BigBasDTO {

	@NotNull
	@NotEmpty
	@Size(min = 3, max = 30, message = "Name will be less then 2 Greater then 20")
	private String name;

	@NotNull
	@NotEmpty
	@Size(min = 3, max = 30, message = "Name will be less then 2 Greater then 20")
	private String customerName;

	@NotNull
	@NotEmpty
	@Size(min = 0, max = 10, message = "PhoneNo will be less then 0 Greater then 10")
	private long phoneNo;

	@NotNull
	@NotEmpty
	@Size(min = 3, max = 30, message = "E-mail will be less then 2 Greater then 20")
	private String email;

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 20, message = "password will be less then 2 Greater then 20")
	private int password;

	@NotNull
	@NotEmpty
	@Size(min = 3, max = 30, message = "Name will be less then 2 Greater then 20")
	private String prodectName;

	@NotNull
	@NotEmpty
	private double price;

	@NotNull
	@NotEmpty(message = "Please Check the Quantity")
	private int quantity;

	@NotNull
	@NotEmpty(message = "Select the Color")
	private String color;

	@NotNull
	@NotEmpty(message = "Menstion the Date Please")
	private LocalDate date;

	@NotNull
	@NotEmpty(message = "Please Select the Place")
	private String place;

}
