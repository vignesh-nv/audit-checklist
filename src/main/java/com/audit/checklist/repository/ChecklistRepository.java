package com.audit.checklist.repository;

import java.util.List;

import com.audit.checklist.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChecklistRepository extends CrudRepository<Question, Integer>{

	List<Question> findByAuditType(String auditType);
	
}
