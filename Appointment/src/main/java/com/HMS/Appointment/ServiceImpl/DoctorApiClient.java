package com.HMS.Appointment.ServiceImpl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.HMS.Appointment.Dto.DoctorDto;



@FeignClient(url="http://localhost:8080",name="Doctor-Service")
public interface DoctorApiClient {
	
	@GetMapping("Doctor/byDoctorId/{doctorId}")
	public DoctorDto findByDoctorId(@PathVariable("doctorId") String doctorId);

}
