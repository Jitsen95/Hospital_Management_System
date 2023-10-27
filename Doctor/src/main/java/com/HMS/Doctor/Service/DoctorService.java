package com.HMS.Doctor.Service;

import java.util.List;

import com.HMS.Doctor.Dto.ApiResponseDto;
import com.HMS.Doctor.Dto.DoctorDto;
import com.HMS.Doctor.Entity.Doctor;

public interface DoctorService {
	
	DoctorDto createDoctor(DoctorDto doctorDto);

	DoctorDto findById(String doctorId);
	
	DoctorDto findByDoctorId(String doctorId);

    List<DoctorDto> findAlldoctor();

    DoctorDto updateDoctor(DoctorDto doctorDto,String doctorId);

    String deleteDoctorById(String doctorId);
    
    ApiResponseDto findByIdWithDepartmentCode(String doctorId);
    
    ApiResponseDto findByIdWithDepartmentName(String doctorId);
    
    List<DoctorDto> findByDepartmentCode(String departmentCode);
	
	List<DoctorDto> findByDepartmentName(String departmentName);

	
    
   

}
