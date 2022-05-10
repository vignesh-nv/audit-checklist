package com.audit.checklist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.audit.checklist.model.AuditType;
import com.audit.checklist.model.Question;
import com.audit.checklist.repository.ChecklistRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ChecklistService {

	@Autowired
	ChecklistRepository repository;

	public List<Question> getAllQuestions(String auditType) {
		return repository.findByAuditType(auditType);
	}
	
//	public List<Question> saveResponse(List<Question> responses) {
//		return repository.saveAll(responses);
//	}
}
