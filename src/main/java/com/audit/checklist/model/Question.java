package com.audit.checklist.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "AuditQuestions")
public class Question implements Serializable{
	/**
	 * This will be the question id for the questions 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "questionId")
	private int questionId;
	/**
	 * This will be the auditType for the questions 
	 */
	@Column(name = "auditType")
	private String auditType;
	
	/**
	 * This will be the questions 
	 */
	
	@Column(name = "question")
	private String question;
	
	/**
	 * This will be the response for the question
	 */
	
	@Column(name = "response")
	private String response;
	
	@Override
	public String toString() {
		return question;
	}

	
	public Question() {
		super();
	}


	public Question(int questionId, String auditType, String question, String response) {
		super();
		this.questionId = questionId;
		this.auditType = auditType;
		this.question = question;
		this.response = response;
	}


	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestions(String question) {
		this.question = question;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	
}
