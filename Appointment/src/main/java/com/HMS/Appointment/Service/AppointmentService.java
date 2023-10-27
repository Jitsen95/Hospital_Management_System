package com.HMS.Appointment.Service;

import java.util.List;

import com.HMS.Appointment.Dto.AppointmentDto;
import com.HMS.Appointment.ServiceImpl.ApiResponseDto;

public interface AppointmentService {
	
	AppointmentDto createAppointment(AppointmentDto appointmentDto);
	
	ApiResponseDto findAppointmentById(String appointmentId);
	
	List<AppointmentDto>findAllAppointments();

}