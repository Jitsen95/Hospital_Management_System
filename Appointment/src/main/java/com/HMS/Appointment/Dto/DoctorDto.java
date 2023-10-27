package com.HMS.Appointment.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDto {
	
	private String doctorId;
	private String firstName;
	private String lastName;
	private String mobile;
	private String email;

}
