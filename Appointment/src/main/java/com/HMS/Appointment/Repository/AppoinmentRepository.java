package com.HMS.Appointment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HMS.Appointment.Entity.Appointment;

public interface AppoinmentRepository extends JpaRepository<Appointment,String> {

}
