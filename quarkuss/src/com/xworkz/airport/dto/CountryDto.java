package com.xworkz.airport.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CountryDto extends AbstractAuditDto {

	@NotNull
	@NotBlank
	@Size(min=5, max=30)
	private String name;
	
	@Min(0)
	@Max(10000)
	private int noOfCountry;
	
	
	
}
