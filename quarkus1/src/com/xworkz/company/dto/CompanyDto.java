package com.xworkz.company.dto;

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
public class CompanyDto extends AbstractAditDto {

	@NotNull
	@NotBlank
	@Size(min=4, max=20)
	private String name;
	
	@NotNull
	@NotBlank
	@Size(min=3, max=30)
	private String empName;
	
	@Min(6)
	@Max(10)
	private int id;
	
}
