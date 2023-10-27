package com.HMS.Appointment.ServiceImpl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.HMS.Appointment.Dto.DepartmentDto;
import com.HMS.Appointment.Dto.DoctorDto;

@FeignClient(url="http://localhost:6060",value="Department-Service")
public interface DepartmentApiClient {
	
	@GetMapping("Department/byDepartmentId/{departmentId}")
	public DepartmentDto findByDepartmentId(@PathVariable("departmentId") String departmentId); 

}


