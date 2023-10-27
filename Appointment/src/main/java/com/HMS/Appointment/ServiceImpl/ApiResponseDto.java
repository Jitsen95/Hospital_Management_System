package com.HMS.Appointment.ServiceImpl;

import org.springframework.http.ResponseEntity;

import com.HMS.Appointment.Dto.AppointmentDto;
import com.HMS.Appointment.Dto.BookingDto;
import com.HMS.Appointment.Dto.DepartmentDto;
import com.HMS.Appointment.Dto.DoctorDto;
import com.HMS.Appointment.Dto.UserDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponseDto {
	
	private DoctorDto doctor;
	private BookingDto bookingDto;
	private DepartmentDto department;
	private UserDto user;

}
