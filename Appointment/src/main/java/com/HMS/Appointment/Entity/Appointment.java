package com.HMS.Appointment.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Appointment_Details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Appointment {

	@Id

	private String appointmentId;
	private int consultationFee;
	private Date bookingDate;

	private String userId;

	private String doctorId;

	private String departmentId;

}
