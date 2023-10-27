package com.HMS.Doctor.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Doctor_Details")

public class Doctor {
	@Id
	@Column(name = "Doctor_ID")
	private String doctorId;
	@Column(name = "First_Name")
	private String firstName;
	@Column(name = "Last_Name")
	private String lastName;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "Email")
	private String email;
	@Column(name = "Position")
	private String position;
	@Column(name = "Mobile")
	private long mobile;
	
	private String departmentCode;
	
	private String departmentName;

}
