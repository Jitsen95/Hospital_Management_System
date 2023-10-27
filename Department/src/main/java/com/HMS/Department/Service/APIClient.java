package com.HMS.Department.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.HMS.Department.Dto.DepartmentDto;

@FeignClient(url="http://localhost:8081",value="DEPARTMENT-SERVICE")
public interface APIClient {
	
	@GetMapping("/Department/byId/{departmentId}")
	public DepartmentDto findById(@PathVariable("departmentId") String departmentId) ;
		
	

}
