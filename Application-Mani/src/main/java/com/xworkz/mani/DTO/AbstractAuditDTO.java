package com.xworkz.mani.DTO;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AbstractAuditDTO{

	private String createdBy;

	private LocalDateTime createdDate;

	private String updatedBy;

	private LocalDateTime updatedDate;

}
