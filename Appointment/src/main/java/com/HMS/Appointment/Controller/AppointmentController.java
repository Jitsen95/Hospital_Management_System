package com.HMS.Appointment.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HMS.Appointment.Dto.AppointmentDto;
import com.HMS.Appointment.Service.AppointmentService;
import com.HMS.Appointment.ServiceImpl.ApiResponseDto;


@RestController
@RequestMapping("/Appointment")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	@PostMapping("/create")
	public ResponseEntity<AppointmentDto> createAppointment(@RequestBody AppointmentDto appointmentDto){
		AppointmentDto newAppointment=appointmentService.createAppointment(appointmentDto);
		return new ResponseEntity<AppointmentDto>(newAppointment,HttpStatus.CREATED);
	}
	
	@GetMapping("/byId/{appointmentId}")
	public ResponseEntity<ApiResponseDto> findById(@PathVariable("appointmentId") String appointmentId) {
		ApiResponseDto apiResponseDto= appointmentService.findAppointmentById(appointmentId);
		return new ResponseEntity<ApiResponseDto>(apiResponseDto, HttpStatus.FOUND);

	}
	@GetMapping("/getAll")
	public ResponseEntity<List<AppointmentDto>> getAllAppointments() {
		List<AppointmentDto> appointmentList = appointmentService.findAllAppointments();
		return new ResponseEntity<List<AppointmentDto>>(appointmentList, HttpStatus.FOUND);

}
}
