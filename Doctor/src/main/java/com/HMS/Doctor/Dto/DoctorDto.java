package com.HMS.Doctor.Dto;

import java.util.Date;

import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
	@Size(min=3,max=20,message="Provide FirstName")
	private String firstName;
	@Size(min=3,max=15,message="Provide LastName")
	private String lastName;
	@NotNull(message="Provide DOB")
	private Date dob;
	@Email(message="Provide Email")
	@NotNull
	private String email;
	@Size(min=3,max=30,message="Provide Position")
	private String position;
	@NotNull(message="Provide Mobile Number")
	private long mobile;
	@NotNull
	private String departmentCode;
	@NotNull
	private String departmentName;
	

}
