package com.xworkz.company.dto;

import java.time.LocalDateTime;

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
public abstract class AbstractAditDto {
	
	private String createdBy;
	private LocalDateTime createdAt;
	private String abdatedAt;
	private LocalDateTime abdatedBy;
	

}
