package com.vsquare.audit.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vsquare.audit.model.AuditType;
import com.vsquare.audit.service.AuditTypeService;

@RestController
public class AuditTypeController {

	@Autowired
	private AuditTypeService auditTypeService;
	
	@PostMapping("/audit-type")
	public AuditType createAuditType(@RequestBody AuditType auditType) {
		return auditTypeService.createAuditType(auditType);
	}

	@PutMapping("/audit-type")
	public AuditType updateAuditType(@RequestBody AuditType auditType) {
		return auditTypeService.updateAuditType(auditType);
	}

	@GetMapping("/audit-type")
	public List<AuditType> findAllAuditType() {
		return auditTypeService.findAllAuditType();
	}

	@DeleteMapping("/audit-type/{id}")
	public void deleteAuditType(@PathVariable("id") int id) {
		auditTypeService.deleteAuditType(id);
	}

}
