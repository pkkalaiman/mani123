package com.xworkz.soldiers.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public abstract class AbstractAuditDto implements Serializable{

	private String createdby;
	private LocalDateTime createdAt;
	private String ubdateedby;
	private LocalDateTime ubdatedAt;
}
