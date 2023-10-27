package com.HMS.Doctor.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HMS.Doctor.Entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,String> {
	
	List<Doctor> findByDepartmentCode(String departmentCode);
	
	List<Doctor> findByDepartmentName(String departmentName);
	
	
	

}
