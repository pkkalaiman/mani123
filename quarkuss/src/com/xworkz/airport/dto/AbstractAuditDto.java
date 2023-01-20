package com.xworkz.airport.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class AbstractAuditDto implements Serializable {
	
	private String createdBy;
	private LocalDateTime createdAt;
	private String ubdatedAt;
	private LocalDateTime ubdatedBy;
	

}
