package com.audit.checklist.controller;

import java.util.ArrayList;
import java.util.List;

import com.audit.checklist.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.audit.checklist.model.AuditType;
import com.audit.checklist.model.Question;
import com.audit.checklist.service.ChecklistService;

@RestController
public class ChecklistController {

	@Autowired
	ChecklistService service;

	@Autowired
	TokenService tokenService;


	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/AuditCheckListQuestions/{auditType}")
	public ResponseEntity<?> getAuditCheckListQuestions(@RequestHeader(value = "Authorization", required = true) String token,
														@PathVariable String auditType) {
		System.out.println("Token" + token);
		boolean isValid = tokenService.checkTokenValidity(token);

		List<Question> questionsList = new ArrayList<>();
		ResponseEntity<?> responseEntity;
		if (!isValid) {
			responseEntity = new ResponseEntity<String>("tokenExpired",
					HttpStatus.FORBIDDEN);
			return responseEntity;
		}
		questionsList = service.getAllQuestions(auditType);
		responseEntity = new ResponseEntity<List<Question>>(questionsList, HttpStatus.OK);
	
		HttpHeaders responseHeaders = new HttpHeaders();
	    responseEntity = ResponseEntity.ok().headers(responseHeaders)
	    		.body(questionsList);
		return responseEntity;
	}
}
