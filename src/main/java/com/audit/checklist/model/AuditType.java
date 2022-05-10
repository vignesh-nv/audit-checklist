package com.audit.checklist.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class AuditType {

	private String auditType;

	
	public AuditType() {
		super();
	}

	public AuditType(String auditType) {
		super();
		this.auditType = auditType;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}
	
}
