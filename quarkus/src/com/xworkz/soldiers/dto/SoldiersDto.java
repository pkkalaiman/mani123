package com.xworkz.soldiers.dto;

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
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SoldiersDto extends AbstractAuditDto {

	@NotNull   // this is Any non PRIMITIVE only
	@NotBlank  // it is String type only
	@Size(min = 3, max = 20)
	private String name;

	@Min(0)
	@Max(10000)
	private int id;

	@NotNull
	@NotBlank
	@Size(min = 5, max = 10)
	private String rank;

	@NotNull
	@NotBlank
	@Size(min = 4, max = 40)
	private String country;

}
