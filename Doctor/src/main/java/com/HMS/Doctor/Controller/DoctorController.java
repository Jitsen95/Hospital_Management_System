package com.HMS.Doctor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HMS.Doctor.Dto.ApiResponseDto;
import com.HMS.Doctor.Dto.DoctorDto;
import com.HMS.Doctor.Service.DoctorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Doctor")
public class DoctorController {

	@Autowired
	DoctorService doctroService;

	@PostMapping("/add")
	public ResponseEntity<DoctorDto> createUser(@Valid @RequestBody DoctorDto doctorDto) {
		return new ResponseEntity<DoctorDto>(doctroService.createDoctor(doctorDto), HttpStatus.CREATED);
	}

	@GetMapping("/byId/{doctorId}")
	public ResponseEntity<DoctorDto> findById(@PathVariable("doctorId") String doctorId) {
		DoctorDto doctorDto = (doctroService.findById(doctorId));
		return new ResponseEntity<DoctorDto>(doctorDto, HttpStatus.FOUND);

	}
	@GetMapping("/byDoctorId/{doctorId}")
	public DoctorDto findByDoctorId(@PathVariable("doctorId") String doctorId) {
		DoctorDto doctorDto = (doctroService.findById(doctorId));
		return doctorDto;

	}
	

	@GetMapping("/all")
	public ResponseEntity<List<DoctorDto>> findAllUsers() {
		return new ResponseEntity<>(doctroService.findAlldoctor(), HttpStatus.FOUND);
	}

	@PutMapping("/update/{doctorId}")
	public ResponseEntity<DoctorDto> updateUser(@PathVariable("doctorId") String doctorId,
			@RequestBody DoctorDto userDto) {
		return new ResponseEntity<>(doctroService.updateDoctor(userDto, doctorId), HttpStatus.OK);
	}

	@DeleteMapping("/remove/{doctorId}")
	public ResponseEntity<String> deleteUserById(@PathVariable("doctorId") String doctorId) {
		return new ResponseEntity<>(doctroService.deleteDoctorById(doctorId), HttpStatus.OK);

	}

	@GetMapping("/byIdWithName/{doctorId}")
	public ResponseEntity<ApiResponseDto> findByIdWithDepartmentName(@PathVariable("doctorId") String doctorId) {
		ApiResponseDto apiResponnseDto = (doctroService.findByIdWithDepartmentName(doctorId));
		return new ResponseEntity<>(apiResponnseDto, HttpStatus.FOUND);

	}

	@GetMapping("/byIdWithCode/{doctorId}")
	public ResponseEntity<ApiResponseDto> findByIdWithDepartmentCode(@PathVariable("doctorId") String doctorId) {
		ApiResponseDto apiResponnseDto = (doctroService.findByIdWithDepartmentCode(doctorId));
		return new ResponseEntity<>(apiResponnseDto, HttpStatus.FOUND);

	}
	@GetMapping("/byDepartmentName/{departmentName}")
	public ResponseEntity<List<DoctorDto>>findByDepartmentName(@PathVariable("departmentName") String departmentName){
		List<DoctorDto> listOfDoctors=doctroService.findByDepartmentName(departmentName);
		return new ResponseEntity<List<DoctorDto>>(listOfDoctors,HttpStatus.FOUND);
	}
	
	@GetMapping("/byDepartmentCode/{departmentCode}")
	public ResponseEntity<List<DoctorDto>>findByDepartmentCode(@PathVariable("departmentCode") String departmentCode){
		List<DoctorDto> listOfDoctors=doctroService.findByDepartmentCode(departmentCode);
		return new ResponseEntity<List<DoctorDto>>(listOfDoctors,HttpStatus.FOUND);
	}
}
